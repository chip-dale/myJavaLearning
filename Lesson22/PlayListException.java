public class PlayListException extends Exception {
    public PlayListException() {
        super();
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

    protected PlayListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
