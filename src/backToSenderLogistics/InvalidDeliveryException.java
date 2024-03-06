package backToSenderLogistics;

public class InvalidDeliveryException extends RuntimeException {
    public InvalidDeliveryException(String message) {
        super(message);
    }
}
