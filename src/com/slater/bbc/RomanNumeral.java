package com.slater.bbc;

import java.util.TreeMap;

public class RomanNumeral implements RomanNumeralGenerator {
    private TreeMap numerals = new TreeMap();

    public RomanNumeral () {
        numerals.put(1, "I");

    }

    public String generate (int num) {
        return "";
    }
}
