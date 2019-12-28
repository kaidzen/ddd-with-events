package org.kaidzen.study.meetup.domen.aggregate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlValueTest {

    @Test
    void test_equals() {
        UrlValue urlValue1 = new UrlValue("http://test.com");
        UrlValue urlValue2 = new UrlValue("http://test.com");

        assertEquals(urlValue1, urlValue2);
        assertTrue(urlValue1.equals(urlValue2));
    }

    @Test
    void test_notEquals() {
        UrlValue urlValue1 = new UrlValue("http://test.com");
        UrlValue urlValue2 = new UrlValue("http://test.com/case");

        assertNotEquals(urlValue1, urlValue2);
        assertFalse(urlValue1.equals(urlValue2));
    }
}