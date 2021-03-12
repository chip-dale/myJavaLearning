public class MusicPlayerException extends Exception {
    public MusicPlayerException() {
    }

    public MusicPlayerException(String message) {
        super(message);
    }

    public MusicPlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MusicPlayerException(Throwable cause) {
        super(cause);
    }

    public MusicPlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
