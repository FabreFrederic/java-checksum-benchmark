package io.fabre.frederic.util;

public class ChecksumException extends Exception {

    public ChecksumException(String msg) {
        super(msg);
    }

    public ChecksumException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ChecksumException(Throwable cause) {
        super(cause);
    }
}
