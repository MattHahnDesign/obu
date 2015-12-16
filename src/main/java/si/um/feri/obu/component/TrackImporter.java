package si.um.feri.obu.component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import si.um.feri.obu.domain.xjc.Track;
import si.um.feri.obu.repository.TrackRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@Component
public class TrackImporter implements CommandLineRunner {

    private ClassPathResource resource = new ClassPathResource("tracks.json");

    @Autowired
    private ApplicationContext context;

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    TrackRepository trackRepository;

    @Override
    public void run(String... strings) throws Exception {

        MongoTemplate template = (MongoTemplate) context.getBean("mongoTemplate");
        if(template.collectionExists("track")) {
            template.dropCollection("track");
        }

        template.createCollection("track");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("url:https://dl.dropboxusercontent.com/u/26331919/tracks.json").openStream()))) {

            String line;
            Gson gson = new Gson();
            Track track;

            while ((line = bufferedReader.readLine()) != null) {
                template.getCollection("track").save((DBObject) JSON.parse(line));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
