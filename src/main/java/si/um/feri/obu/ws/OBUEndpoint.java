package si.um.feri.obu.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import si.um.feri.obu.domain.xjc.*;

@Endpoint
public class OBUEndpoint implements IOBUEndpoint {

    private static final String NAMESPACE_URI = "http://feri.um.si/obu";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOBUIdRequest")
    @ResponsePayload
    public GetOBUIdResponse getOBUId(@RequestPayload GetOBUIdRequest request) {
        GetOBUIdResponse response = new GetOBUIdResponse();
        response.setOBUId("fucking id!!!");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDriveHistoryRequest")
    @ResponsePayload
    public GetDriveHistoryResponse getDriveHistory(@RequestPayload GetDriveHistoryRequest request) {
        System.out.println("arg = [" + request + "]");
        GetDriveHistoryResponse response = new GetDriveHistoryResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationRequest")
    @ResponsePayload
    public GetLocationResponse getLocation(@RequestPayload GetLocationRequest request) {
        System.out.println("arg = [" + request + "]");
        GetLocationResponse response = new GetLocationResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "receiveNotificationRequest")
    @ResponsePayload
    public ReceiveNotificationResponse receiveNotification(@RequestPayload ReceiveNotificationRequest request) {
        System.out.println("request = [" + request + "]");
        ReceiveNotificationResponse response = new ReceiveNotificationResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterListRequest")
    @ResponsePayload
    public GetCarParameterListResponse getCarParameterList(@RequestPayload GetCarParameterListRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarParameterListResponse response = new GetCarParameterListResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterValueRequest")
    @ResponsePayload
    public GetCarParameterValueResponse getCarParameterValue(@RequestPayload GetCarParameterValueRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarParameterValueResponse response = new GetCarParameterValueResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarCommandListRequest")
    @ResponsePayload
    public GetCarCommandListResponse getCarCommandList(@RequestPayload GetCarCommandListRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarCommandListResponse response = new GetCarCommandListResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sendCarCommandRequest")
    @ResponsePayload
    public SendCarCommandResponse sendCarCommand(@RequestPayload SendCarCommandRequest request) {
        System.out.println("request = [" + request + "]");
        SendCarCommandResponse response = new SendCarCommandResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarErrorsRequest")
    @ResponsePayload
    public GetCarErrorsResponse getCarErrors(@RequestPayload GetCarErrorsRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarErrorsResponse response = new GetCarErrorsResponse();
        return response;
    }
}
