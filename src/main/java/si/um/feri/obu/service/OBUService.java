package si.um.feri.obu.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import si.um.feri.obu.domain.model.Notification;
import si.um.feri.obu.domain.model.OBU;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.repository.OBURepository;
import si.um.feri.obu.repository.TrackRepository;

import java.util.*;

@Service
public class OBUService {

    private Logger logg = LogManager.getLogger(OBUService.class.getName());

    private static int DELAY_5_MINUTES = 5;
    private static int MINUTE_IN_MS = 60000;
    private static int SECOND_IN_MS = 1000;

    private HashMap<String, OBU> OBUs;
    private List<String> trackIds;

    private Random rand = new Random();

    private OBURepository obuRepository;
    private TrackRepository trackRepository;

    @Autowired
    public OBUService(OBURepository obuRepository, TrackRepository trackRepository) {
        this.obuRepository = obuRepository;
        this.trackRepository = trackRepository;
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

    public OBU createNewOBU() {
        if(OBUs != null && trackIds != null) {
            OBU obu = new OBU();
            obu.setCurrentTrack(trackRepository.findOne(trackIds.get(rand.nextInt(trackIds.size()))));
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
        List<String> trackIds = this.OBUs.get(OBUId).getDrivenRoutesIds();

        for(String id : trackIds) {
            response.getTracks().add(trackRepository.findOne(id));
        }

        return response;
    }

    public GeoLocation getCurrentOBULocation(GetLocationRequest request) {
        OBU obu = OBUs.get(request.getOBUId());
        if(obu == null) {
            return null;
        }
        if(obu.getTrackStartedDateTime() <= new Date().getTime() && new Date().getTime() <= obu.getTrackEndDateTime()) {
            logg.info("magic");
            //do the magic and find location from track
            logg.info("duration: " + obu.getCurrentTrack().getDuration());
            logg.info("trackPoints size: " + obu.getCurrentTrack().getTrackPoints().size());
            long timeStep = obu.getCurrentTrack().getDuration() / obu.getCurrentTrack().getTrackPoints().size();
            logg.info("timeStep:" + timeStep);
            long currentTime = new Date().getTime();
            long timeSum = obu.getTrackStartedDateTime();
            for(int i=0; i<obu.getCurrentTrack().getTrackPoints().size(); i++) {
                logg.info("current: " + currentTime + "   timesum:" + timeSum + "   diff:" + (currentTime-timeSum));
                if(timeSum+(timeStep * SECOND_IN_MS) >= currentTime) {
                    logg.info("id trackPoint: " + i);
                    return obu.getCurrentTrack().getTrackPoints().get(i).getLocation();
                }
                timeSum += (timeStep * SECOND_IN_MS);
            }
            return obu.getCurrentTrack().getTrackPoints().get(obu.getCurrentTrack().getTrackPoints().size()-1).getLocation();
        } else {
            logg.info("not magic");
            obu.getDrivenRoutesIds().add(obu.getCurrentTrack().getId());
            obu.setCurrentTrack(trackRepository.findOne(trackIds.get(rand.nextInt(trackIds.size()))));
            obu.setTrackStartedDateTime(new Date().getTime());
            obu.setTrackEndDateTime(obu.getTrackStartedDateTime() + (obu.getCurrentTrack().getDuration() * SECOND_IN_MS));
            logg.info("OBU IS DRIVING NEW TRACK: " + obu.getCurrentTrack().getId());
            OBUs.replace(request.getOBUId(), obu);
            obuRepository.save(obu);
            return obu.getCurrentTrack().getTrackPoints().get(0).getLocation();
        }
    }

    public int sendNotificationToOBU(SendNotificationRequest request) {
        if(this.OBUs.get(request.getOBUId()).getNotificationsReceived()
                .add(new Notification(new Date().getTime(), request.getMessage()))) {
            obuRepository.save(this.OBUs.get(request.getOBUId()));
            return HttpStatus.OK.value();
        }
        return HttpStatus.CONFLICT.value();
    }



    public GetCarErrorsResponse getCarErrors(GetCarErrorsRequest request) {
        GetCarErrorsResponse response = new GetCarErrorsResponse();
        response.getErrors().addAll(this.OBUs.get(request.getOBUId()).getCarErrors());
        return response;
    }

}
