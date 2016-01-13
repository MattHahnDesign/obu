package si.um.feri.obu.service;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import si.um.feri.obu.component.JmsReceiver;
import si.um.feri.obu.component.JmsSender;
import si.um.feri.obu.domain.model.Failure;
import si.um.feri.obu.domain.model.Notification;
import si.um.feri.obu.domain.model.OBU;
import si.um.feri.obu.domain.model.RegisterPermissionResponse;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.repository.OBURepository;
import si.um.feri.obu.repository.TrackRepository;
import si.um.feri.obu.wsservice.dars1.DarsDataService;
import si.um.feri.obu.wsservice.dars1.DarsDataService_Service;
import si.um.feri.obu.wsservice.dars1.Lokacija;
import si.um.feri.obu.wsservice.parkirisce2.Rezervacije;
import si.um.feri.obu.wsservice.parkirisce2.SemicolonRezervacije;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

@Service
public class OBUService {

    private Logger logg = LogManager.getLogger(OBUService.class.getName());

    private static int DELAY_5_MINUTES = 5;
    private static int MINUTE_IN_MS = 60000;
    private static int SECOND_IN_MS = 1000;

    private static String REGISTER_URL = "http://register-stirkac.rhcloud.com/api/users/";

    private HashMap<String, OBU> OBUs;
    private List<String> trackIds;

    private Random rand = new Random();

    private OBURepository obuRepository;
    private TrackRepository trackRepository;

    private RestTemplate restTemplate;


    private DarsDataService dds;
    private SemicolonRezervacije park;

    @Autowired
    JmsReceiver receiver;

    @Autowired
    public OBUService(OBURepository obuRepository, TrackRepository trackRepository) {
        this.obuRepository = obuRepository;
        this.trackRepository = trackRepository;
        this.restTemplate = new RestTemplate();
        this.dds = new DarsDataService_Service().getBasicHttpBindingDarsDataService();
        this.park = new Rezervacije().getBasicHttpBindingSemicolonRezervacije();
        populateOBUs();
        populateTrackIds();
    }

    private boolean populateOBUs() {
        //populate OBUs from DB
        List<OBU> obuList = obuRepository.findAll();
        OBUs = new HashMap<>();
        for(OBU obu : obuList) {
            this.OBUs.put(obu.getId(), obu);
        }

        logg.info("POPULATE OBUs: " + this.OBUs.size());

        return true;
    }

    private boolean populateTrackIds() {
        //populate trackIds from DB
        List<Track> tracks = trackRepository.findAll();
        trackIds = new ArrayList<>();
        for(Track track : tracks) {
            trackIds.add(track.getId());
        }

        logg.info("POPULATE TRACKs:" + this.trackIds.size());

        return true;
    }

    public boolean hasPermission(String obuId, String trr, String method) {
        RegisterPermissionResponse response = restTemplate.getForObject(REGISTER_URL + trr + "/obus/" + obuId + "/access_right/" + method, RegisterPermissionResponse.class);
        if(response != null)
            return response.isAllowed();
        return false;
    }

    public OBU createNewOBU() {
        if(OBUs != null && trackIds != null) {
            OBU obu = new OBU();
            obu.setCurrentTrack(getRandomTrack());
            obu.setTrackStartedDateTime(new Date().getTime());
            obu.setTrackEndDateTime(obu.getTrackStartedDateTime() + (obu.getCurrentTrack().getDuration() * SECOND_IN_MS)); // * 1000 to convert from second to milis
            obu.setDrivenRoutesIds(new ArrayList<>());
            obu.setNotificationsReceived(new ArrayList<>());

            //save created OBU to DB
            obu = obuRepository.save(obu);

            logg.info("CREATED NEW OBU: " + obu);
            logg.info("Track id: " + obu.getCurrentTrack().getId());
            logg.info("Track starts: " + new Date(obu.getTrackStartedDateTime()).toString());
            logg.info("Track ends: " + new Date(obu.getTrackEndDateTime()));
            logg.info("Duration od track: " + (obu.getCurrentTrack().getDuration() / 60) + " min");

            OBUs.put(obu.getId(), obu);

            return obu;

        } else {
            populateOBUs();
            populateTrackIds();
            return createNewOBU();
        }
    }

    public GetDriveHistoryResponse getOBUDriveHistory(String OBUId, GetDriveHistoryResponse response) {
        if(OBUs.containsKey(OBUId)) {
            List<String> trackIds = this.OBUs.get(OBUId).getDrivenRoutesIds();

            for(String id : trackIds) {
                response.getTracks().add(trackRepository.findOne(id));
            }
            return response;
        }

        throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
    }

    public GetDriveHistoryResponse getDriveHistoryResponse(String OBUid) {
        GetDriveHistoryResponse response = new GetDriveHistoryResponse();
        return getOBUDriveHistory(OBUid, response);
    }

    public GeoLocation getCurrentOBULocation(GetLocationRequest request) {
        if(!OBUs.containsKey(request.getOBUId()))
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        OBU obu = OBUs.get(request.getOBUId());
        if(obu == null) {
            return null;
        }
        if(obu.getFailure() != null) {
            return obu.getFailure().getGeoLocation();
        }
        if(obu.getTrackStartedDateTime() <= new Date().getTime() && new Date().getTime() <= obu.getTrackEndDateTime()) {
            long timeStep = obu.getCurrentTrack().getDuration() / obu.getCurrentTrack().getTrackPoints().size();
            long currentTime = new Date().getTime();
            long timeSum = obu.getTrackStartedDateTime();
            for(int i=0; i<obu.getCurrentTrack().getTrackPoints().size(); i++) {
                if(timeSum+(timeStep * SECOND_IN_MS) >= currentTime) {
                    return obu.getCurrentTrack().getTrackPoints().get(i).getLocation();
                }
                timeSum += (timeStep * SECOND_IN_MS);
            }
            if(obu.getReservationID() != null) {
                logg.info("Klic WS - odpovej rezervacijo - return:" + this.park.odpovejRezervacijo(obu.getReservationID()));
            }
            return obu.getCurrentTrack().getTrackPoints().get(obu.getCurrentTrack().getTrackPoints().size()-1).getLocation();
        } else {
            obu.getDrivenRoutesIds().add(obu.getCurrentTrack().getId());
            obu.setCurrentTrack(getRandomTrack());
            obu.setTrackStartedDateTime(new Date().getTime());
            obu.setTrackEndDateTime(obu.getTrackStartedDateTime() + (obu.getCurrentTrack().getDuration() * SECOND_IN_MS));
            XMLGregorianCalendar start = new XMLGregorianCalendarImpl(new GregorianCalendar());
            GregorianCalendar endGC = new GregorianCalendar();
            endGC.add(Calendar.HOUR_OF_DAY,1);
            XMLGregorianCalendar end = new XMLGregorianCalendarImpl(endGC);
            int parkID = this.park.rezervirajParkirnoMesto(request.getOBUId(),start,end);
            logg.info("Klic WS - rezerviraj parkirno mesto - return:" + parkID);
            obu.setReservationID(parkID);
            OBUs.replace(request.getOBUId(), obu);
            obuRepository.save(obu);
            return obu.getCurrentTrack().getTrackPoints().get(0).getLocation();
        }
    }

    private Track getRandomTrack() {
        Track track = trackRepository.findOne(trackIds.get(rand.nextInt(trackIds.size())));
        if(track == null)
            return getRandomTrack();
        return track;
    }

    public GeoLocation getCurrentOBULocation(String obuId) {
        GetLocationRequest getLocationRequest = new GetLocationRequest();
        getLocationRequest.setOBUId(obuId);
        GeoLocation loc = getCurrentOBULocation(getLocationRequest);
        if(loc == null)
            return getCurrentOBULocation(obuId);
        return loc;
    }

    private void generateCarParams(String obuId) {
        OBU obu = OBUs.get(obuId);

        if(obu.getFailure() != null) {
            return;
        }
        float leftLimitPressure = 1.7f;
        float rightLimitPressure = 2.8f;
        float leftLimitOil = -5.0f;
        float rightLimitOil = 5.0f;
        float leftLimitTemp = 70.0f;
        float rightLimitTemp = 85.0f;
        if(obu.getCarParameters() == null) {
            obu.setCarParameters(new HashMap<CarParameter, Float>());
            obu.getCarParameters().put(CarParameter.OIL, 0f);
            obu.getCarParameters().put(CarParameter.ENGINE_TEMPERATURE, 0.00f);
            obu.getCarParameters().put(CarParameter.TYRE_PRESSURE, 2.2f);
        }
        obu.getCarParameters().replace(CarParameter.OIL, leftLimitOil + new Random().nextFloat() * (rightLimitOil - leftLimitOil));
        obu.getCarParameters().replace(CarParameter.TYRE_PRESSURE, leftLimitPressure + new Random().nextFloat() * (rightLimitPressure - leftLimitPressure));
        obu.getCarParameters().replace(CarParameter.ENGINE_TEMPERATURE, leftLimitTemp + new Random().nextFloat() * (rightLimitTemp - leftLimitTemp));

        Random r = new Random();
        int magicNum = r.nextInt(100-1) + 1;
        if(magicNum >= 99) {
            magicNum = r.nextInt(5-1) +1;

            switch (magicNum) {
                case 1: {
                    //engine error: call servis - avtovleka
                    CarError engineError = new CarError();
                    engineError.setCode(CarErrorType.ENGINE.value() + "-ERROR: breakdown!");
                    engineError.setTimestamp(new Date().getTime());
                    engineError.setType(CarErrorType.ENGINE);
                    obu.getCarErrors().add(engineError);
                    obu.setFailure(new Failure(new Date().getTime(), getCurrentOBULocation(obuId)));
                    //TODO: call avtoservis - avtovleka + obvesti dars1
                    break;
                }

                case 2: {
                    //computer warn
                    CarError computerWarn = new CarError();
                    computerWarn.setCode(CarErrorType.COMPUTER.value() + "-WARN: unknown issue");
                    computerWarn.setTimestamp(new Date().getTime());
                    computerWarn.setType(CarErrorType.COMPUTER);
                    obu.getCarErrors().add(computerWarn);

                    GeoLocation gc = getCurrentOBULocation(obuId);
                    Lokacija lokacija = new Lokacija();
                    lokacija.setSirina((double)gc.getLon());
                    lokacija.setDolzina((double)gc.getLat());

                    logg.info("Klic WS - pridobi zapore na poti - return:" + this.dds.pridobiZaporeNaPoti(lokacija));
                    logg.info("Klic WS - pridobi naslednjo bencinsko črpalko - return:" + this.dds.pridobiNaslednjoBencinskoCrpalko(lokacija));
                    break;
                }

                case 3: {
                    //sensor warn
                    CarError sensorWarn = new CarError();
                    sensorWarn.setCode(CarErrorType.SENSOR.value() + "-WARN: unknown sensor issue");
                    sensorWarn.setTimestamp(new Date().getTime());
                    sensorWarn.setType(CarErrorType.SENSOR);
                    obu.getCarErrors().add(sensorWarn);

                    GeoLocation loc = getCurrentOBULocation(obuId);
                    Lokacija lokacija = new Lokacija();
                    lokacija.setDolzina((double)loc.getLon());
                    lokacija.setSirina((double)loc.getLat());
                    logg.info("Klic WS - pridobi vremensko napoved na poti - return:" + this.dds.pridobiVremenskoNapovedNaPoti(lokacija));
                    break;
                }

                case 4: {
                    //sensor error: call servis - they'll fix it
                    CarError sensorError = new CarError();
                    sensorError.setCode(CarErrorType.SENSOR.value() + "-ERROR: sensor missread, need to restart computer");
                    sensorError.setTimestamp(new Date().getTime());
                    sensorError.setType(CarErrorType.SENSOR);
                    obu.getCarErrors().add(sensorError);
                    //todo: call avtoservis
                    break;
                }

                case 5: {
                    //computer error: call servis - avtovleka
                    CarError computerError = new CarError();
                    computerError.setCode(CarErrorType.COMPUTER.value() + "-ERROR: computer failure!");
                    computerError.setTimestamp(new Date().getTime());
                    computerError.setType(CarErrorType.COMPUTER);
                    obu.getCarErrors().add(computerError);
                    obu.setFailure(new Failure(new Date().getTime(), getCurrentOBULocation(obuId)));
                    //todo: call avtoservis - avtovleka + obvesti dars1
                    break;
                }
            }
            OBUs.replace(obuId, obu);
            obuRepository.save(obu);
        }
    }

    public int sendNotificationToOBU(SendNotificationRequest request) {
        if(!OBUs.containsKey(request.getOBUId()))
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        if(this.OBUs.get(request.getOBUId()).getNotificationsReceived()
                .add(new Notification(new Date().getTime(), request.getMessage()))) {
            obuRepository.save(this.OBUs.get(request.getOBUId()));
            return HttpStatus.OK.value();
        }
        return HttpStatus.CONFLICT.value();
    }

    public GetCarErrorsResponse getCarErrors(GetCarErrorsRequest request) {
        if(!OBUs.containsKey(request.getOBUId()))
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        GetCarErrorsResponse response = new GetCarErrorsResponse();
        response.getErrors().addAll(this.OBUs.get(request.getOBUId()).getCarErrors());
        return response;
    }

    public GetCarParameterValueResponse getCarParameter(GetCarParameterValueRequest request) {
        if(!OBUs.containsKey(request.getOBUId()))
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        GetCarParameterValueResponse response = new GetCarParameterValueResponse();
        response.setValue(OBUs.get(request.getOBUId()).getCarParameters().get(request.getCarParameter()));
        return response;
    }

    public GetCarParameterValueResponse getCarParameter(String OBUId, String carParameter) {
        GetCarParameterValueRequest request = new GetCarParameterValueRequest();
        request.setOBUId(OBUId);
        request.setCarParameter(CarParameter.valueOf(carParameter));
        return getCarParameter(request);
    }

    public List<CarError> getCarErrors(String obuId) {
        if(!OBUs.containsKey(obuId))
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        return OBUs.get(obuId).getCarErrors();
    }

    public GeoLocation getCarEndTrackPointGeoLocation(String obuId) {
        if(OBUs.get(obuId).getFailure() != null)
            return null;
        return OBUs.get(obuId).getCurrentTrack().getTrackPoints().get(OBUs.get(obuId).getCurrentTrack().getTrackPoints().size()-1).getLocation();
    }

    public Map<CarParameter, Float> getCarParams(String OBUid) {
        return OBUs.get(OBUid).getCarParameters();
    }

    public Set<String> getOBUKeys() {
        return this.OBUs.keySet();
    }

    @Scheduled(fixedDelay = 5000)
    public void getLocationOfOBU() {
        if(OBUs.size()>0 && trackIds.size()>0) {
            for(String obuId : OBUs.keySet()) {
                getCurrentOBULocation(obuId);
                generateCarParams(obuId);
            }
        }
    }
}
