package org.edifree.edifact.main.all.exception;

public class EdifactValidateException extends Exception {

    public EdifactValidateException() {
    }

    public EdifactValidateException(String message) {
        super(message);
    }

    public EdifactValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdifactValidateException(Throwable cause) {
        super(cause);
    }

    public EdifactValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
