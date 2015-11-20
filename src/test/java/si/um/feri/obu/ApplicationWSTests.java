package si.um.feri.obu;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;
import si.um.feri.obu.model.GetDriveHistoryRequest;
import si.um.feri.obu.model.ObjectFactory;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
@WebIntegrationTest(randomPort = true)
public class ApplicationWSTests {

    private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

    @Value("${local.server.port}")
    private int port = 0;

    @Before
    public void init() throws Exception {
        marshaller.setPackagesToScan(ClassUtils.getPackageName(ObjectFactory.class));
        marshaller.afterPropertiesSet();
    }

    @Test
    public void testSendAndReceiveDriveHistory() {
        GetDriveHistoryRequest request = new GetDriveHistoryRequest();
        request.setOBUId("some_id");
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive("http://localhost:" +
                + port + "/ws", request));
    }

}
