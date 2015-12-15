package si.um.feri.obu.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import si.um.feri.obu.domain.xjc.*;

@Endpoint
public interface IOBUEndpoint {

    public GetOBUIdResponse createNewOBU(GetOBUIdRequest request);

    public GetDriveHistoryResponse getDriveHistory(GetDriveHistoryRequest request);

    public GetLocationResponse getLocation(GetLocationRequest request);

    public SendNotificationResponse sendNotification (SendNotificationRequest request);

    public GetCarParameterListResponse getCarParameterList (GetCarParameterListRequest request);

    public GetCarParameterValueResponse getCarParameterValue (GetCarParameterValueRequest request);

    public GetCarCommandListResponse getCarCommandList (GetCarCommandListRequest request);

    public SendCarCommandResponse sendCarCommand(SendCarCommandRequest request);

    public GetCarErrorsResponse getCarErrors(GetCarErrorsRequest request);

}
