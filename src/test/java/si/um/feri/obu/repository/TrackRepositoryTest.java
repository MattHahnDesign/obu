package si.um.feri.obu.repository;

import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import si.um.feri.obu.ObuApplication;
import si.um.feri.obu.domain.xjc.GeoLocation;
import si.um.feri.obu.domain.xjc.Track;
import si.um.feri.obu.domain.xjc.TrackPoint;

import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
public class TrackRepositoryTest {

    private Track track;

    public TrackRepositoryTest() {
        this.track = new Track();
        track.setId(new ObjectId().toString());
        GeoLocation location = new GeoLocation();
        location.setLat(4.532f);
        location.setLon(33.2123f);
        TrackPoint trackPoint = new TrackPoint();
        trackPoint.setLocation(location);
        trackPoint.setTimestamp(new Date().getTime());
        track.getTrackPoints().add(trackPoint);
    }

    @Autowired
    TrackRepository trackRepository;

    @Before
    public void testTrackRepository() {
        assertNotNull(trackRepository);
    }

    @Test
    public void testFindAllTracks() {
        List<Track> trackList = trackRepository.findAll();
        assertNotNull(trackList);
        assertTrue(trackList.size() > 0);
    }

    @Test
    public void testFindById() {
        List<Track> trackList = trackRepository.findAll();
        Random random = new Random();
        int randomItemIndex = random.nextInt(trackList.size());
        assertEquals(trackList.get(randomItemIndex).getId(),
                     trackRepository.findOne(trackList.get(randomItemIndex).getId()).getId());
    }

    @Test
    public void testSaveTrack() {
        Track trackSaved = trackRepository.save(track);
        assertNotNull(trackSaved);
        assertEquals(track.getTrackPoints().size(), trackSaved.getTrackPoints().size());
        assertEquals(track.getTrackPoints().get(0), trackSaved.getTrackPoints().get(0));
    }

    @Test
    public void testDeleteTrack() {
        System.out.println("TRACK ID=" + this.track.getId());
        int size = trackRepository.findAll().size();
        trackRepository.delete(track);
        assertNull(trackRepository.findOne(track.getId()));
    }

}
