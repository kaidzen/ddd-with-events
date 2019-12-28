package org.kaidzen.study.meetup.domen.exception;

public class InvalidLengthAggregateException extends DomainException {

    public InvalidLengthAggregateException(String message) {
        super(message);
    }

    public InvalidLengthAggregateException(String message, Throwable cause) {
        super(message, cause);
    }
}
