package org.edifree.edifact.main.all.exception;

public class EdifactLibraryException extends Exception {

    public EdifactLibraryException() {
    }

    public EdifactLibraryException(String message) {
        super(message);
    }

    public EdifactLibraryException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdifactLibraryException(Throwable cause) {
        super(cause);
    }

    public EdifactLibraryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
