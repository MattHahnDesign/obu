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
@Profile("pro")
public class ProdMongoDBConfig {

    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(), dbName);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return  new MongoTemplate(mongoDbFactory());
    }

}
