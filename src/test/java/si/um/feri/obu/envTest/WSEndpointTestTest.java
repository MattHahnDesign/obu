package si.um.feri.obu.envTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;
import si.um.feri.obu.ObuApplication;
import si.um.feri.obu.domain.xjc.GetDriveHistoryRequest;
import si.um.feri.obu.domain.xjc.GetOBUIdRequest;
import si.um.feri.obu.domain.xjc.ObjectFactory;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
@ActiveProfiles("test")
public class WSEndpointTestTest {

    private static String HOST = System.getenv("WERCKER_APPLICATION_URL");
    private static final String WS = "/ws";

    private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

    private int port = 80;

    @Before
    public void init() throws Exception {
        marshaller.setPackagesToScan(ClassUtils.getPackageName(ObjectFactory
                .class));
        marshaller.afterPropertiesSet();
    }

    @Test
    public void testSendAndReceiveOBUId() {
        GetOBUIdRequest request = new GetOBUIdRequest();
        assertNotNull(new WebServiceTemplate(marshaller)
                .marshalSendAndReceive(HOST + port + WS, request));
    }

    @Test
    public void testSendAndReceiveDriveHistory() {
        GetDriveHistoryRequest request = new GetDriveHistoryRequest();
        request.setOBUId("some_id");
        assertNotNull(new WebServiceTemplate(marshaller)
                .marshalSendAndReceive(HOST + port + WS, request));
    }

    @Test
    public void testSendAndReceiveGeoLocation() {

    }

}
