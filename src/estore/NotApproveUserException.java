package estore;

public class NotApproveUserException extends RuntimeException {
    public NotApproveUserException(String message) {
        super(message);
    }
}
