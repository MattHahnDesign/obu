package si.um.feri.obu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@EnableScheduling
@EnableJms
@EnableSwagger2
public class ObuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObuApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("obu")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/rest.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Documentation for usage of REST API of OBU module")
                .description("Interactive documentation for usage of REST API of OBU module.")
                .contact("Grega Vrbančič & Matej Hahn")
                .license("WTFPL – Do What the Fuck You Want to Public License.")
                .licenseUrl("http://www.wtfpl.net")
                .version("2")
                .build();
    }
}
