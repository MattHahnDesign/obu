package si.um.feri.obu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJms
public class ObuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObuApplication.class, args);
    }
}
