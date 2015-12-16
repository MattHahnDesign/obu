package si.um.feri.obu.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.um.feri.obu.domain.model.OBU;
import si.um.feri.obu.domain.xjc.GetDriveHistoryResponse;
import si.um.feri.obu.domain.xjc.Track;
import si.um.feri.obu.repository.OBURepository;
import si.um.feri.obu.repository.TrackRepository;

import java.util.*;

@Service
public class OBUService {

    private Logger logg = LogManager.getLogger(OBUService.class.getName());

    private static int DELAY_5_MINUTES = 5;

    private HashMap<String, OBU> OBUs;
    private List<String> trackIds;

    private Random rand = new Random();

    @Autowired
    private OBURepository obuRepository;

    @Autowired
    private TrackRepository trackRepository;

    private boolean populateOBUs() {
        //populate OBUs from DB
        List<OBU> obuList = obuRepository.findAll();
        OBUs = new HashMap<>();
        for(OBU obu : obuList) {
            this.OBUs.put(obu.getId(), obu);
        }

        return true;
    }

    private boolean populateTrackIds() {
        //populate trackIds from DB
        List<Track> tracks = trackRepository.findAll();
        trackIds = new ArrayList<>();
        for(Track track : tracks) {
            trackIds.add(track.getId());
        }

        return true;
    }

    public OBU createNewOBU() {
        if(OBUs != null && trackIds != null) {
            OBU obu = new OBU();
            obu.setCurrentTrack(trackRepository.findOne(trackIds.get(rand.nextInt(trackIds.size()))));
            obu.setTrackStartedDateTime(new Date().getTime() + (DELAY_5_MINUTES * 60 * 1000)); // start track after 5 minutes
            obu.setTrackEndDateTime(obu.getTrackStartedDateTime() + (obu.getCurrentTrack().getDuration() * 1000)); // * 1000 to convert from second to milis
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





}
