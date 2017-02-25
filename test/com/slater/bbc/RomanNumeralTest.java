package com.slater.bbc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
    RomanNumeral test = new RomanNumeral();

    /* test of numbers up to 10 */
    @Test
    public void romanNumeralGeneratorTest_numbersUpTo10 () {
        assertEquals(test.generate(1), "I");
        assertEquals(test.generate(2), "II");
        assertEquals(test.generate(4), "IV");
        assertEquals(test.generate(5), "V");
        assertEquals(test.generate(7), "VII");
        assertEquals(test.generate(9), "IX");
        assertEquals(test.generate(10), "X");
    }

    /* test of numbers up to 100 */
    @Test
    public void romanNumeralGeneratorTest_numbersUpTo100 () {
        assertEquals(test.generate(25), "XXV");
        assertEquals(test.generate(40), "XL");
        assertEquals(test.generate(50), "L");
        assertEquals(test.generate(87), "LXXXVII");
        assertEquals(test.generate(90), "XC");
        assertEquals(test.generate(100), "C");
    }

}
