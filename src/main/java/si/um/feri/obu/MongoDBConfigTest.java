package si.um.feri.obu;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
@Profile("test")
public class MongoDBConfigTest {

    @Value("${spring.data.mongodb.database}")
    private String dbName;

    private String host = System.getenv("MONGO_PORT_27017_TCP_ADDR");

    @Value("#{systemEnvironment['MONGO_PORT_27017_TCP_PORT']}")
    private int port = Integer.parseInt(System.getenv("MONGO_PORT_27017_TCP_PORT"));

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
