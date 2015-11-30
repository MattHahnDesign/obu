package si.um.feri.obu;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
@Profile("pro")
public class MongoDBConfigTest {

    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @Value("#{systemEnvironment['MONGO_PORT_27017_TCP_ADDR']}")
    private String host;

    @Value("#{systemEnvironment['MONGO_PORT_27017_TCP_PORT']}")
    private int port;

    @Bean
    MongoClient mongoClient() throws Exception {
        return new MongoClient(host, port);
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(mongoClient(), dbName);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}
