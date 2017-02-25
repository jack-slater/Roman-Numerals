package com.slater.bbc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    RomanNumeral test = new RomanNumeral();
    @Test
    public void romanNumeralGeneratorTest () {
        assertEquals(test.generate(1), "I");
    }
}
