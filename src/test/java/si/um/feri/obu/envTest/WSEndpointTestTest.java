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
import si.um.feri.obu.domain.xjc.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ObuApplication.class)
@WebIntegrationTest("server.port:0")
@ActiveProfiles("test")
public class WSEndpointTestTest {

    private static final String HOST = "http://127.0.0.1:";
    private static final String WS = "/ws";
    @Value("${local.server.port}")
    private int port;

    private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

    @Before
    public void init() throws Exception {
        marshaller.setPackagesToScan(ClassUtils.getPackageName(ObjectFactory.class));
        marshaller.afterPropertiesSet();
    }

    @Test
    public void testSendAndReceiveOBUId() {
        GetOBUIdRequest request = new GetOBUIdRequest();
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }

    /*@Test
    public void testSendAndReceiveDriveHistory() {
        GetDriveHistoryRequest request = new GetDriveHistoryRequest();
        request.setOBUId("some_id");
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }*/

    @Test
    public void testSendAndReceiveGeoLocation() {
        GetLocationRequest request = new GetLocationRequest();
        request.setOBUId("some_id");
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }

    /*@Test
    public void testReceiveNotification() {
        SendNotificationRequest request = new SendNotificationRequest();
        request.setOBUId("some_id");
        request.setMessage("this is notification message!");
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }*/

    @Test
    public void testSendAndReceiveCarParameterList() {
        GetCarParameterListRequest request = new GetCarParameterListRequest();
        request.setOBUId("some_id");
        GetCarParameterListResponse response = (GetCarParameterListResponse) new WebServiceTemplate(marshaller)
                .marshalSendAndReceive(HOST + port + WS, request);
        assertNotNull(response);
        assertArrayEquals(response.getCarParameters().toArray(), CarParameter.values());
    }

    @Test
    public void testSendAndReceiveCarParameterValue() {
        GetCarParameterValueRequest request = new GetCarParameterValueRequest();
        request.setOBUId("some_id");
        request.setCarParameter(CarParameter.FUEL);
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }

    @Test
    public void testSendAndReceiveCarCommandList() {
        GetCarCommandListRequest request = new GetCarCommandListRequest();
        request.setOBUId("some_id");
        GetCarCommandListResponse response = (GetCarCommandListResponse) new WebServiceTemplate(marshaller)
                .marshalSendAndReceive(HOST + port + WS, request);
        assertNotNull(response);
        assertArrayEquals(response.getCommands().toArray(), CarCommand.values());
    }

    @Test
    public void testSendCarCommand() {
        SendCarCommandRequest request = new SendCarCommandRequest();
        request.setOBUId("some_id");
        request.setCarCommand(CarCommand.DOOR_LOCK);
        request.setCommandState(CommandState.OPEN);
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }

    @Test
    public void testSendAndReceiveCarErrors() {
        GetCarErrorsRequest request = new GetCarErrorsRequest();
        request.setOBUId("some_id");
        assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive(HOST + port + WS, request));
    }

}
