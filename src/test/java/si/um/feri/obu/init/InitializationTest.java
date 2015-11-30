package si.um.feri.obu.init;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import si.um.feri.obu.ObuApplication;
import si.um.feri.obu.repository.TrackRepository;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
public class InitializationTest {

    @Autowired
    TrackRepository trackRepository;

    @Test
    public void testTrackImporter() {
        assertNotNull(trackRepository.findAll());
        assertTrue(trackRepository.findAll().size() == trackRepository.count());
        System.out.println("COUNT=" + trackRepository.count() + "  :  " + trackRepository.findAll().size());
    }

}
