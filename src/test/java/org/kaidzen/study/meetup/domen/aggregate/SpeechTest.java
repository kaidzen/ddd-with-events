package org.kaidzen.study.meetup.domen.aggregate;

import org.junit.Test;
import org.kaidzen.study.meetup.domen.exception.DomainException;

public class SpeechTest {

    @Test(expected = DomainException.class)
    public void test_ExceptionWhenShortTitle() {
        String title = "abc";
        String urlValue = "urlValue";
        String description = "description";
        int speechType = 2;

        new Speech(
                new Title(title),
                new UrlValue(urlValue),
                description,
                new SpeechType(speechType));
    }
}