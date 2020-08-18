package com.qa.day6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    @Test
    public void test() {
        assertEquals(MorseCode.morse("abc"), ".- /-... /-.-. /");
        assertEquals(MorseCode.morse("zyx"), "--.. /-.-- /-..- /");

    }
}
