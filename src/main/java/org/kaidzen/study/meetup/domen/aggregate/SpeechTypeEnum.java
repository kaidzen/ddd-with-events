package org.kaidzen.study.meetup.domen.aggregate;

public enum SpeechTypeEnum {
    SELF_PLACED_LABS(1),
    TRAINING_VIDEO(2),
    CONFERENCE(3);

    private final int value;

    SpeechTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
