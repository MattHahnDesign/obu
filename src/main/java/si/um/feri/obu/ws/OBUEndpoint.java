package si.um.feri.obu.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.service.OBUService;

@Endpoint
public class OBUEndpoint implements IOBUEndpoint {

    private Logger logg = LogManager.getLogger(OBUEndpoint.class.getName());

    private static final String NAMESPACE_URI = "http://feri.um.si/obu";

    @Autowired
    private OBUService obuService;

    //DONE - TODO:WRITE TESTS
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOBUIdRequest")
    @ResponsePayload
    public GetOBUIdResponse createNewOBU(@RequestPayload GetOBUIdRequest request) {
        GetOBUIdResponse response = new GetOBUIdResponse();
        response.setOBUId(obuService.createNewOBU().getId());
        return response;
    }

    //DONE - TODO:WRITE TESTS
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDriveHistoryRequest")
    @ResponsePayload
    public GetDriveHistoryResponse getDriveHistory(@RequestPayload GetDriveHistoryRequest request) {
        System.out.println("arg = [" + request + "]");
        return obuService.getOBUDriveHistory(request.getOBUId(), new GetDriveHistoryResponse());
    }

    //DONE - TODO:WRITE TESTS
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationRequest")
    @ResponsePayload
    public GetLocationResponse getLocation(@RequestPayload GetLocationRequest request) {
        System.out.println("arg = [" + request + "]");
        GetLocationResponse response = new GetLocationResponse();
        response.setGeoLocation(obuService.getCurrentOBULocation(request));
        return response;
    }

    //DONE - TODO:WRITE TESTS
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "receiveNotificationRequest")
    @ResponsePayload
    public SendNotificationResponse sendNotification(@RequestPayload SendNotificationRequest request) {
        System.out.println("request = [" + request + "]");
        SendNotificationResponse response = new SendNotificationResponse();
        response.setStatus(obuService.sendNotificationToOBU(request));
        return response;
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterListRequest")
    @ResponsePayload
    public GetCarParameterListResponse getCarParameterList(@RequestPayload GetCarParameterListRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarParameterListResponse response = new GetCarParameterListResponse();
        for (CarParameter cp : CarParameter.values()) {
            response.getCarParameters().add(cp);
        }

        return response;
    }

    //TODO
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterValueRequest")
    @ResponsePayload
    public GetCarParameterValueResponse getCarParameterValue(@RequestPayload GetCarParameterValueRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarParameterValueResponse response = new
                GetCarParameterValueResponse();
        return response;
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarCommandListRequest")
    @ResponsePayload
    public GetCarCommandListResponse getCarCommandList(@RequestPayload GetCarCommandListRequest request) {
        System.out.println("request = [" + request + "]");
        GetCarCommandListResponse response = new GetCarCommandListResponse();
        for (CarCommand cc : CarCommand.values()) {
            response.getCommands().add(cc);
        }

        return response;
    }

    //TODO
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sendCarCommandRequest")
    @ResponsePayload
    public SendCarCommandResponse sendCarCommand(@RequestPayload SendCarCommandRequest request) {
        System.out.println("request = [" + request + "]");
        SendCarCommandResponse response = new SendCarCommandResponse();
        return response;
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarErrorsRequest")
    @ResponsePayload
    public GetCarErrorsResponse getCarErrors(@RequestPayload GetCarErrorsRequest request) {
        System.out.println("request = [" + request + "]");
        return obuService.getCarErrors(request);
    }
}
