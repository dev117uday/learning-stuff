package exception;

// this is checked exception, you need to handle it somehow

public class CustomCheckedException extends Exception {
    CustomCheckedException(String message) {
        super(message);
    }
}
