package com.qa.day5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlackjackSimpleTest {
    @Test
    public void test() {
        assertEquals(BlackjackSimple.play(22,22), 0);
        assertEquals(BlackjackSimple.play(22, 18), 18);
        assertEquals(BlackjackSimple.play(16, 25), 16);
        assertEquals(BlackjackSimple.play(10, 11), 11);

    }
}
