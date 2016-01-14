package si.um.feri.obu.api;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import si.um.feri.obu.domain.model.CarCommandParameter;
import si.um.feri.obu.domain.model.GetCarCommandStateListReponse;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.service.OBUService;

@Api(value = "rest api", description = "Endpoint for management of OBUs")
@RestController
@RequestMapping({"/rest", "/restSecure"})
public class RestControllerOBU {

    @Autowired
    OBUService obuService;

    @ApiOperation(value = "Returns id of created OBU", response = GetOBUIdResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetOBUIdResponse.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/createNewOBU", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetOBUIdResponse getNewOBUId() {
        GetOBUIdResponse getOBUIdResponse = new GetOBUIdResponse();
        getOBUIdResponse.setOBUId(obuService.createNewOBU().getId());
        return getOBUIdResponse;
    }

    @ApiOperation(value = "Returns current geo location of OBU with given id", response = GetLocationResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetLocationResponse.class),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/location", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetLocationResponse getOBULocation(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        //if(obuService.hasPermission(OBUId, trr, "getLocation")) {
            GetLocationResponse response = new GetLocationResponse();
            response.setGeoLocation(obuService.getCurrentOBULocation(OBUId));
            return response;
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }

    @ApiOperation(value = "Returns histroy of OBU driven routes with given id", response = GetDriveHistoryResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetDriveHistoryResponse.class),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found - OBU with given id doesn't exist!"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/driveHistory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetDriveHistoryResponse getDriveHistroy(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        //if(obuService.hasPermission(OBUId, trr, "getDriveHistory")) {
            GetDriveHistoryResponse response = new GetDriveHistoryResponse();
            return obuService.getOBUDriveHistory(OBUId, response);
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }

    @ApiOperation(value = "Post new notification to OBU with given id", response = SendNotificationResponse.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "notification", value = "Notification message - content", required = true, dataType = "string", paramType = "query")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = SendNotificationResponse.class),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found - OBU with given id doesn't exist!"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/notification", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SendNotificationResponse sendNotification(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr,
                                                     @RequestParam("notification") String message) {
        //if(obuService.hasPermission(OBUId, trr, "sendNotification")) {
            SendNotificationResponse response = new SendNotificationResponse();
            SendNotificationRequest request = new SendNotificationRequest();
            request.setOBUId(OBUId);
            request.setMessage(message);
            response.setStatus(obuService.sendNotificationToOBU(request));
            return response;
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }

    @ApiOperation(value = "Returns list of all posible car parameters", response = GetCarParameterListResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetCarParameterListResponse.class),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/parameterList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetCarParameterListResponse getCarParameterlist(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        GetCarParameterListResponse response = new GetCarParameterListResponse();
        for (CarParameter cp : CarParameter.values()) {
            response.getCarParameters().add(cp);
        }

        return response;
    }

    @ApiOperation(value = "Returns value of given parameter name for OBU with given id", response = GetCarParameterValueResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetCarParameterValueResponse.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found - OBU with given id doesn't exist!"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/parameter/{parameter}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetCarParameterValueResponse getCarParameterValue(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr,
                                                             @PathVariable("parameter") String parameter) {
        //if(obuService.hasPermission(OBUId, trr, "getCarParameterValue")) {
            GetCarParameterValueRequest request = new GetCarParameterValueRequest();
            request.setOBUId(OBUId);
            request.setTrr(trr);
            if(CarParameter.fromValue(parameter) == null)
                throw new IllegalArgumentException("Given parameter does not exist!");
            request.setCarParameter(CarParameter.fromValue(parameter));
            return obuService.getCarParameter(request);
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }

    @ApiOperation(value = "Returns list of all possible commands for car", response = GetCarParameterListResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetCarParameterListResponse.class),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/commandList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetCarCommandListResponse getCarCommandList(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        GetCarCommandListResponse response = new GetCarCommandListResponse();
        for (CarCommand cc : CarCommand.values()) {
            response.getCommands().add(cc);
        }
        return response;
    }

    @ApiOperation(value = "Returns list of all posible command states for car", response = GetCarCommandStateListReponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetCarCommandStateListReponse.class),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/commandStateList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetCarCommandStateListReponse getCarCommandStateList(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        GetCarCommandStateListReponse response = new GetCarCommandStateListReponse();
        for(CommandState cs : CommandState.values()) {
            response.getCommandStates().add(cs);
        }
        return response;
    }

    @ApiOperation(value = "Post new car command to OBU with given id ", response = SendCarCommandResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = SendCarCommandResponse.class),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found - OBU with given id doesn't exist!"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/command", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public SendCarCommandResponse sendCarCommand(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr,
                                                 @RequestBody CarCommandParameter carCommandParameter) {
        //if(obuService.hasPermission(OBUId, trr, "sendCarCommand")) {
            SendCarCommandResponse response = new SendCarCommandResponse();
            response.setStatus(HttpStatus.OK.value());
            return response;
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }

    @ApiOperation(value = "Returns list of all errors of OBU for given id", response = GetCarErrorsResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = GetCarErrorsResponse.class),
            @ApiResponse(code = 403, message = "Forbidden - No permission to access data for this OBU device!"),
            @ApiResponse(code = 404, message = "Not Found - OBU with given id doesn't exist!"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/{obuId}/{trr}/error", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GetCarErrorsResponse getCarErrors(@PathVariable("obuId") String OBUId, @PathVariable("trr") String trr) {
        //if(obuService.hasPermission(OBUId, trr, "getCarErrors")) {
            GetCarErrorsRequest request = new GetCarErrorsRequest();
            request.setOBUId(OBUId);
            request.setTrr(trr);
            return obuService.getCarErrors(request);
        //}
        //throw new HttpServerErrorException(HttpStatus.FORBIDDEN);
    }
}
