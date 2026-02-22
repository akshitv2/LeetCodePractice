package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L013_ROMAN_TO_INTEGER {

    static void main() {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MCDLXXVI"));

    }

    private static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int romanToInt(String s) {
        int finVal = 0;
        for(int i=0;i<s.length();i++) {
            int cur = getValue(s.charAt(i));
            finVal += (cur - (finVal % cur)*2);
        }
        return finVal;
    }
}
