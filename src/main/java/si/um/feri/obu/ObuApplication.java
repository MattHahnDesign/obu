package si.um.feri.obu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"si.um.feri.obu", "si.um.feri.obu.ws"})
public class ObuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObuApplication.class, args);
    }
}
