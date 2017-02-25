package com.slater.bbc;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeral implements RomanNumeralGenerator {
    private TreeMap<Integer, String> numerals = new TreeMap<Integer, String>(Collections.reverseOrder());

    public RomanNumeral () {
        numerals.put(1, "I");
        numerals.put(4, "IV");
        numerals.put(5, "V");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(40, "XL");
        numerals.put(50, "L");
        numerals.put(90, "XC");
        numerals.put(100, "C");
        numerals.put(400, "CD");
        numerals.put(500, "D");
        numerals.put(900, "CM");
        numerals.put(1000, "M");
    }

    public String generate (int num) {
        String newRomanNumeral = "";
        for (Map.Entry<Integer, String> entry: numerals.entrySet()) {
            Integer standard = entry.getKey();
            String roman = entry.getValue();
            while (standard <= num) {
                newRomanNumeral += roman;
                num -= standard;
            }
        }
        return newRomanNumeral;
    }
}
