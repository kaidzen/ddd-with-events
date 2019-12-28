package org.kaidzen.study.meetup.domen.aggregate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleTest {

    @Test
    void test_equals() {
        Title title1 = new Title("Some title");
        Title title2 = new Title("Some title");

        assertEquals(title1, title2);
        assertTrue(title1.equals(title2));
    }

    @Test
    void test_notEquals() {
        Title title1 = new Title("Some title one");
        Title title2 = new Title("Some title two");

        assertNotEquals(title1, title2);
        assertFalse(title1.equals(title2));
    }
}