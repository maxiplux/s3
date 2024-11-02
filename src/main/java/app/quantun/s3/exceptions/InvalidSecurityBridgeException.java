package app.quantun.idp.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidSecurityBridgeException extends RuntimeException {
    public InvalidSecurityBridgeException(String message) {
        super(message);
    }

    public InvalidSecurityBridgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
