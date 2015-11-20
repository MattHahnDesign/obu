package si.um.feri.obu;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.authentication.UserCredentials;
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
        String openshiftMongoDbHost = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
        int openshiftMongoDbPort = Integer.parseInt(System.getenv("OPENSHIFT_MONGODB_DB_PORT"));
        String username = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
        String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");
        UserCredentials userCredentials = new UserCredentials(username,password);
        String databaseName = System.getenv("OPENSHIFT_APP_NAME");
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(new MongoClient(openshiftMongoDbHost, openshiftMongoDbPort), dbName, userCredentials);
        return mongoDbFactory;
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return  new MongoTemplate(mongoDbFactory());
    }

}
