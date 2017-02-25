package com.slater.bbc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
    RomanNumeral test = new RomanNumeral();

    /* test of numbers up to 10 */
    @Test
    public void romanNumeralGeneratorTest_numbersUpTo10 () {
        assertEquals(test.generate(1), "I");
        assertEquals(test.generate(4), "IV");
        assertEquals(test.generate(5), "V");
        assertEquals(test.generate(9), "IX");
        assertEquals(test.generate(10), "X");
    }

    /* test of numbers up to 100 */
    @Test
    public void romanNumeralGeneratorTest_numbersUpTo100 () {
        assertEquals(test.generate(40), "XL");
        assertEquals(test.generate(50), "L");
        assertEquals(test.generate(90), "XC");
        assertEquals(test.generate(100), "C");
    }

    /* test of numbers up to 1000 */
    @Test
    public void romanNumeralGeneratorTest_numbersUpTo1000 () {
        assertEquals(test.generate(400), "CD");
        assertEquals(test.generate(500), "D");
        assertEquals(test.generate(900), "CM");
        assertEquals(test.generate(1000), "M");
    }

    /* test random numbesr for correct results */
    @Test
    public void romanNumeralGeneratorTest_randomNumbers () {
        assertEquals(test.generate(2), "II");
        assertEquals(test.generate(7), "VII");
        assertEquals(test.generate(25), "XXV");
        assertEquals(test.generate(87), "LXXXVII");
        assertEquals(test.generate(177), "CLXXVII");
        assertEquals(test.generate(406), "CDVI");
        assertEquals(test.generate(981), "CMLXXXI");
        assertEquals(test.generate(3999), "MMMCMXCIX");
    }

    /* test to handle caveat of only numbers between 1 and 3999 */
    @Test
    public void romanNumeralGeneratorTest_caveat () {
        assertEquals(test.generate(0), "Number must be between 1 and 3999");
        assertEquals(test.generate(4000), "Number must be between 1 and 3999");
    }

}
