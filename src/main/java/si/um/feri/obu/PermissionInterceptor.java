package si.um.feri.obu;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.MethodEndpoint;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.SoapEndpointInterceptor;

import javax.xml.soap.SOAPException;


public class PermissionInterceptor implements SoapEndpointInterceptor {

    @Override
    public boolean understands(SoapHeaderElement soapHeaderElement) {
        return false;
    }

    @Override
    public boolean handleRequest(MessageContext messageContext, Object o) throws Exception {
        MethodEndpoint methodEndpoint = (MethodEndpoint) o;

        System.out.println("handle request: " + methodEndpoint.getMethod().getName());

        if(!methodEndpoint.getMethod().getName().equals("createNewOBU")) {
            //TODO: preveri v registru če ima klicatelj dovoljenje za klic te operacije
            /*if(ni permissiona) {
                throw new SOAPException("You don't have a permission to execute this method!");
            }*/
        }

        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object o) throws Exception {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object o) throws Exception {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object o, Exception e) throws Exception {

    }
}
