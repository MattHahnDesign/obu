package si.um.feri.obu.component;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;
import si.um.feri.obu.domain.xjc.Track;
import si.um.feri.obu.parser.SaxOSMHandler;
import si.um.feri.obu.repository.TrackRepository;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileNotFoundException;
import java.io.IOException;

@Component
@Profile("dev")
public class TrackImporterDev implements CommandLineRunner {

    private Logger log = Logger.getLogger(TrackImporterDev.class.getName());

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public void run(String... strings) throws Exception {

        log.info("START RUNNING TrackImporter...");

        if(trackRepository.count() < 47469) {

            log.info("STARTED PARSING...");
            SaxOSMHandler handler = new SaxOSMHandler();
            SAXParserFactory factory = SAXParserFactory.newInstance();
            try {

                Resource resource = resourceLoader.getResource("url:https://dl.dropboxusercontent.com/u/26331919/slovenia_ways.osm");
                SAXParser saxParser = factory.newSAXParser();

                saxParser.parse(resource.getInputStream(), handler);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            log.info("END PARSING");

            log.info("DROP COLLECTION");
            trackRepository.deleteAll();

            log.info("START INSERTING in DB");
            for(Track track : handler.getTrackList()) {
                trackRepository.save(track);
                log.info("INSERT=" + track);
            }
            log.info("END INSERTING in DB");

        }

    }

}
