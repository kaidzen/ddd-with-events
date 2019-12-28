package org.kaidzen.study.meetup.domen.aggregate;

import org.kaidzen.study.meetup.domen.exception.IllegalEnumAggregateException;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class SpeechType {

    private final SpeechTypeEnum speechTypeEnum;

    public SpeechType(int speechType) {
        Optional<SpeechTypeEnum> result = Arrays.stream(SpeechTypeEnum.values())
                .filter(speechTypeConstant -> speechTypeConstant.getValue() == speechType)
                .findFirst();
        if (result.isPresent()) {
            this.speechTypeEnum = result.get();
        } else {
            throw new IllegalEnumAggregateException("There is missed such speech type: " +speechType);
        }
    }

    public SpeechType(SpeechTypeEnum speechTypeEnum) {
        this.speechTypeEnum = speechTypeEnum;
    }

    public SpeechType(String speechType) {
        this(parseOrError(speechType));
    }

    private static int parseOrError(String speechType) {
        try {
            return Integer.parseInt(speechType);
        } catch (NumberFormatException e){
            throw new IllegalEnumAggregateException("There is missed such speech type: " +speechType);
        }
    }

    public SpeechTypeEnum getSpeechTypeEnum() {
        return speechTypeEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpeechType)) return false;
        SpeechType that = (SpeechType) o;
        return speechTypeEnum == that.speechTypeEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speechTypeEnum);
    }
}
