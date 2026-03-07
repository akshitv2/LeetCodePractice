package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.leetcode.COMMON.print;

public class L017_LETTER_COMBINATIONS_OF_PHONE_NUMBER {
    static void main() {
        print(letterCombinations("234"));
    }

    public static char[] getMappings(char digit) {
        return switch (digit) {
            case '2' -> new char[]{'a', 'b', 'c'};
            case '3' -> new char[]{'d', 'e', 'f'};
            case '4' -> new char[]{'g', 'h', 'i'};
            case '5' -> new char[]{'j', 'k', 'l'};
            case '6' -> new char[]{'m', 'n', 'o'};
            case '7' -> new char[]{'p', 'q', 'r', 's'};
            case '8' -> new char[]{'t', 'u', 'v'};
            case '9' -> new char[]{'w', 'x', 'y', 'z'};
            default -> new char[]{};
        };
    }

    public static List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        letterCombinations(digits, new StringBuilder(), answer, 0);
        return answer;
    }

    public static void letterCombinations(String digits, StringBuilder current, List<String> answer, int n) {
        if (n == digits.length()) {
            answer.add(current.toString());
            return;
        }
        char cur = digits.charAt(n);
        char[] maps = getMappings(cur);
        for (char ch : maps) {
            letterCombinations(digits, current.append(ch), answer, n + 1);
            current.deleteCharAt(n);
        }
    }

}
