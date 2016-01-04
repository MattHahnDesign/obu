package si.um.feri.obu.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import si.um.feri.obu.domain.xjc.CarParameter;
import si.um.feri.obu.domain.xjc.GeoLocation;
import si.um.feri.obu.domain.xjc.GetCarParameterValueResponse;
import si.um.feri.obu.domain.xjc.GetDriveHistoryResponse;
import si.um.feri.obu.service.OBUService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.Map;
import java.util.Set;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    OBUService obuService;

    //Dashboard REST API
    @RequestMapping(value = "/ids", method = RequestMethod.GET)
    public Set<String> getAllOBUIds() {
        return obuService.getOBUKeys();
    }

    @RequestMapping(value = "/{obuId}/location", method = RequestMethod.GET, produces="application/json")
    public GeoLocation getOBULocation(@PathVariable("obuId") String obuId) {
        return obuService.getCurrentOBULocation(obuId);
    }

    @RequestMapping(value = "/{obuId}/driveHistory", method = RequestMethod.GET, produces="application/json")
    public GetDriveHistoryResponse getOBUDriveHistory(@PathVariable("obuId") String obuId) {
        return obuService.getDriveHistoryResponse(obuId);
    }

    @RequestMapping(value = "/{obuId}/param/{carParam}", method = RequestMethod.GET, produces="application/json")
    public GetCarParameterValueResponse getCarParamValue(@PathVariable("obuId") String obuId, @PathVariable("carParam") String carParam) {
        return obuService.getCarParameter(obuId, carParam);
    }

    @RequestMapping(value = "/{obuId}/params", method = RequestMethod.GET, produces="application/json")
    public Map<CarParameter, Float> getCarParams(@PathVariable("obuId") String obuId) {
        return obuService.getCarParams(obuId);
    }

}
