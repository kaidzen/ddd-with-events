package org.kaidzen.study.meetup.domen.aggregate;

import org.kaidzen.study.meetup.domen.exception.InvalidLengthAggregateException;

import java.util.Objects;

public class Title {

    private final String value;

    private int minValue = 10;
    private int maxValue = 60;

    public Title(String value) {
        if (value.length() < minValue) {
            throw new InvalidLengthAggregateException(
                    String.format("Value is too short: less than %s", minValue));
        }
        if (value.length() > maxValue) {
            throw new InvalidLengthAggregateException(
                    String.format("Value is too short: less than %s", maxValue));
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Title)) return false;
        Title title = (Title) obj;
        return Objects.equals(value, title.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
