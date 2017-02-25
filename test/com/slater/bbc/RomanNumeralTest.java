package com.slater.bbc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
    RomanNumeral test = new RomanNumeral();

    /* test of numbers below 10 */
    @Test
    public void romanNumeralGeneratorTest () {
        assertEquals(test.generate(1), "I");
        assertEquals(test.generate(2), "II");
        assertEquals(test.generate(4), "IV");
        assertEquals(test.generate(5), "V");
        assertEquals(test.generate(7), "VII");
        assertEquals(test.generate(9), "IX");
        assertEquals(test.generate(10), "X");
    }

}
