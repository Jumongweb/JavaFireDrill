package bankApp;

public class InvalidMoveException extends Throwable {
    public InvalidMoveException(String message) {
        super(message);
    }
}
