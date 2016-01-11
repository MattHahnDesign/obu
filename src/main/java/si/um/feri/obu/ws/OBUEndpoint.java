package si.um.feri.obu.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapFaultException;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.service.OBUService;

@Endpoint
public class OBUEndpoint implements IOBUEndpoint {

    private Logger logg = LogManager.getLogger(OBUEndpoint.class.getName());

    private static final String NAMESPACE_URI = "http://feri.um.si/obu";
    private static final String NOT_ALLOWED = "No permission to access data for this OBU device!";

    @Autowired
    private OBUService obuService;

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOBUIdRequest")
    @ResponsePayload
    public GetOBUIdResponse createNewOBU(@RequestPayload GetOBUIdRequest request) {
        GetOBUIdResponse response = new GetOBUIdResponse();
        response.setOBUId(obuService.createNewOBU().getId());
        return response;
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDriveHistoryRequest")
    @ResponsePayload
    public GetDriveHistoryResponse getDriveHistory(@RequestPayload GetDriveHistoryRequest request) {
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "getDriveHistory")) {
            GetDriveHistoryResponse response = new GetDriveHistoryResponse();
            return obuService.getOBUDriveHistory(request.getOBUId(), response);
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationRequest")
    @ResponsePayload
    public GetLocationResponse getLocation(@RequestPayload GetLocationRequest request) {
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "getLocation")) {
            GetLocationResponse response = new GetLocationResponse();
            response.setGeoLocation(obuService.getCurrentOBULocation(request));
            return response;
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sendNotificationRequest")
    @ResponsePayload
    public SendNotificationResponse sendNotification(@RequestPayload SendNotificationRequest request) {
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "sendNotification")) {
            SendNotificationResponse response = new SendNotificationResponse();
            response.setStatus(obuService.sendNotificationToOBU(request));
            return response;
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterListRequest")
    @ResponsePayload
    public GetCarParameterListResponse getCarParameterList(@RequestPayload GetCarParameterListRequest request) {
        GetCarParameterListResponse response = new GetCarParameterListResponse();
        for (CarParameter cp : CarParameter.values()) {
            response.getCarParameters().add(cp);
        }

        return response;
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarParameterValueRequest")
    @ResponsePayload
    public GetCarParameterValueResponse getCarParameterValue(@RequestPayload GetCarParameterValueRequest request) {
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "getCarParameterValue")) {
            return obuService.getCarParameter(request);
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarCommandListRequest")
    @ResponsePayload
    public GetCarCommandListResponse getCarCommandList(@RequestPayload GetCarCommandListRequest request) {
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
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "sendCarCommand")) {
            SendCarCommandResponse response = new SendCarCommandResponse();
            response.setStatus(200);
            return response;
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }

    //DONE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarErrorsRequest")
    @ResponsePayload
    public GetCarErrorsResponse getCarErrors(@RequestPayload GetCarErrorsRequest request) {
        if(obuService.hasPermission(request.getOBUId(), request.getTrr(), "getCarErrors")) {
            return obuService.getCarErrors(request);
        }
        throw new SoapFaultException(NOT_ALLOWED);
    }
}
