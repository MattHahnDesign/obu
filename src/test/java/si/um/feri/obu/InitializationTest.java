package si.um.feri.obu;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import si.um.feri.obu.repository.TrackRepository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
@Profile("none")
public class InitializationTest {

    @Autowired
    TrackRepository trackRepository;

    @Before
    public void testTrackRepository() {
        assertNotNull(trackRepository);
    }

    @Test
    public void testTrackImporter() {
        assertNotNull(trackRepository.findAll());
        assertTrue(trackRepository.findAll().size() == trackRepository.count());
        System.out.println("COUNT=" + trackRepository.count() + "  :  " + trackRepository.findAll().size());
    }

}
