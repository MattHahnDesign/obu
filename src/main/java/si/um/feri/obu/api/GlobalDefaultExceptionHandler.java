package si.um.feri.obu.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "OBU with given id doesn't exist!")
    @ExceptionHandler({HttpClientErrorException.class})
    public void handleNotFound(HttpServletRequest req, Exception exception) {

    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Given parameter does not exist!")
    @ExceptionHandler({IllegalArgumentException.class})
    public void handleIllegalArgument(HttpServletRequest req, Exception exception) {

    }

}
