public class PlayListException extends Exception {
    public PlayListException() {
    }

    public PlayListException(String message) {
        super(message);
    }

    public PlayListException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayListException(Throwable cause) {
        super(cause);
    }

    public PlayListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
