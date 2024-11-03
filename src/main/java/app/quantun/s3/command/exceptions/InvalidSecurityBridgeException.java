package app.quantun.s3.exceptions;


public class InvalidSecurityBridgeException extends RuntimeException {
    public InvalidSecurityBridgeException(String message) {
        super(message);
    }

    public InvalidSecurityBridgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
