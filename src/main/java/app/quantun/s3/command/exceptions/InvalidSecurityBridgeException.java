package app.quantun.s3.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class InvalidSecurityBridgeException extends RuntimeException {
    public InvalidSecurityBridgeException(String message) {
        super(message);
    }

    public InvalidSecurityBridgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
