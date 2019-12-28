package org.kaidzen.study.meetup.domen.aggregate;

import org.junit.jupiter.api.Test;
import org.kaidzen.study.meetup.domen.exception.IllegalEnumAggregateException;

import static org.junit.jupiter.api.Assertions.*;

public class SpeechTypeTest {

    @Test
    public void test_equals() {
        SpeechType speechType1 = new SpeechType(SpeechTypeEnum.CONFERENCE);
        SpeechType speechType2 = new SpeechType(SpeechTypeEnum.CONFERENCE);

        assertEquals(speechType1, speechType2);
        assertTrue(speechType1.equals(speechType2));
    }

    @Test
    public void test_notEquals() {
        SpeechType speechType1 = new SpeechType(SpeechTypeEnum.CONFERENCE);
        SpeechType speechType2 = new SpeechType(SpeechTypeEnum.TRAINING_VIDEO);

        assertNotEquals(speechType1, speechType2);
        assertFalse(speechType1.equals(speechType2));
    }

    @Test()
    void test_wrongConstantValueThrowException() {
        assertThrows(IllegalEnumAggregateException.class, () -> new SpeechType(8));
    }
}