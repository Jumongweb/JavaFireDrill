package myDiary.exceptions;

public class InvalidEntryException extends RuntimeException {
    public InvalidEntryException(String message) {
        super(message);
    }
}
