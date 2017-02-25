package com.slater.bbc;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeral implements RomanNumeralGenerator {
    private TreeMap<Integer, String> numerals = new TreeMap();

    public RomanNumeral () {
        numerals.put(1, "I");

    }

    public String generate (int num) {
        String newRomanNumberal = "";
        for (Map.Entry<Integer, String> entry: numerals.entrySet()) {
            Integer standard = entry.getKey();
            String roman = entry.getValue();
            while (standard <= num) {
                newRomanNumberal += roman;
                num -= standard;
            }
        }
        return newRomanNumberal;
    }
}
