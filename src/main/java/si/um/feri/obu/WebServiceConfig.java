package si.um.feri.obu;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import java.util.List;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet
            (ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "obu")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema obuSchema) {
        DefaultWsdl11Definition wsdl11Definition = new
                DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ObuPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setSchema(obuSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema obuSchema() {
        return new SimpleXsdSchema(new ClassPathResource("obu.xsd"));
    }

    /*@Bean
    PermissionInterceptor permissionInterceptor() {
        PermissionInterceptor permissionInterceptor = new PermissionInterceptor();
        return permissionInterceptor;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(permissionInterceptor());
    }*/
}
