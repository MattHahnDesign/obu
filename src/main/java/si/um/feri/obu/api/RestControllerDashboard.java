package si.um.feri.obu.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import si.um.feri.obu.domain.xjc.*;
import si.um.feri.obu.service.OBUService;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class RestControllerDashboard {

    @Autowired
    OBUService obuService;

    @RequestMapping(value = "/ids", method = RequestMethod.GET)
    public Set<String> getAllOBUIds() {
        return obuService.getOBUKeys();
    }

    @RequestMapping(value = "/{obuId}/location", method = RequestMethod.GET, produces = "application/json")
    public GeoLocation getOBULocation(@PathVariable("obuId") String obuId) {
        return obuService.getCurrentOBULocation(obuId);
    }

    @RequestMapping(value = "/{obuId}/driveHistory", method = RequestMethod.GET, produces = "application/json")
    public GetDriveHistoryResponse getOBUDriveHistory(@PathVariable("obuId") String obuId) {
        return obuService.getDriveHistoryResponse(obuId);
    }

    @RequestMapping(value = "/{obuId}/param/{carParam}", method = RequestMethod.GET, produces = "application/json")
    public GetCarParameterValueResponse getCarParamValue(@PathVariable("obuId") String obuId, @PathVariable("carParam") String carParam) {
        return obuService.getCarParameter(obuId, carParam);
    }

    @RequestMapping(value = "/{obuId}/params", method = RequestMethod.GET, produces = "application/json")
    public Map<CarParameter, Float> getCarParams(@PathVariable("obuId") String obuId) {
        return obuService.getCarParams(obuId);
    }

    @RequestMapping(value= "/{obuId}/currentTrackEndLocation", method = RequestMethod.GET, produces = "application/json")
    public GeoLocation getCurrentTrack(@PathVariable("obuId") String obuId) {
        return obuService.getCarEndTrackPointGeoLocation(obuId);
    }

    @RequestMapping(value = "/{obuId}/carErrors", method = RequestMethod.GET, produces = "application/json")
    public List<CarError> getCarErrors(@PathVariable("obuId") String obuId) {
        return obuService.getCarErrors(obuId);
    }

}
