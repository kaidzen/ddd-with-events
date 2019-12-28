package org.kaidzen.study.meetup.domen.aggregate;

import org.kaidzen.study.meetup.domen.exception.InvalidLengthAggregateException;
import org.kaidzen.study.meetup.domen.exception.InvalidUrlAggregateException;
import org.springframework.util.StringUtils;

import java.util.Objects;

public class UrlValue {
    private final String value;

    public UrlValue(String value) {
        if (StringUtils.isEmpty(value)) {
            throw new InvalidLengthAggregateException(
                    "Url value cannot be null or empty");
        }
        if (!validateValue(value)) {
            throw new InvalidUrlAggregateException(
                    String.format("The value is not valid: %s", value));
        }
        this.value = value;
    }

    private boolean validateValue(String value) {
        return true;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UrlValue)) return false;
        UrlValue urlValue = (UrlValue) o;
        return Objects.equals(value, urlValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
