package org.kaidzen.study.meetup.domen.exception;

public class IllegalEnumAggregateException extends DomainException {
    public IllegalEnumAggregateException(String message) {
        super(message);
    }
}
