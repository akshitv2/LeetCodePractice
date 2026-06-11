package com.dsa.arrays;

import org.junit.jupiter.api.Test;

public class StringsProbs {

    static boolean isSame(String a, String b) {
        int na = a.length();
        int nb = b.length();
        if (na != nb) {
            return false;
        }
        for (int i = 0; i < na; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(String a) {
        int i = 0, j = a.length() - 1;
        while (j > i) {
            if (a.charAt(i++) != a.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    static String toggleCase(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : a.toCharArray()) {
            int plus = c < 'a' ? 32 : -32;
            stringBuilder.append((char) (c + plus));
        }
        return stringBuilder.toString();
    }

    static boolean checkSubstring(String a, String b) {
        for (int i = 0; i < a.length() - b.length() + 1; i++) {
            boolean matches = true;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                return true;
            }
        }
        return false;
    }

    @Test
    void isSame() {
        String a = "abc", b = "abcd";
        System.out.println(isSame(a, b));
    }

    @Test
    void isPalindrome() {
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("abcddcba"));
        System.out.println(isPalindrome("abcddeba"));

    }

    @Test
    void toggleCase() {
        System.out.println(toggleCase("abcdcbaA"));

    }

    @Test
    void removeOccurence() {
        System.out.println(removeOccurence("geeksforgeeks", 'e'));
        System.out.println(removeSpaces("geeks for geeks"));
    }

    String removeOccurence(String a, char t) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c != t) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    String removeSpaces(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    @Test
    void checkSubstring() {
        System.out.println(checkSubstring("AXY", "ADXCPY"));
        System.out.println(checkSubstring("ADXCPY", "AXY"));
        System.out.println(checkSubstring("ADXCPY", "CPY"));
    }

    @Test
    void firstNonRep() {
        firstNonRepeatingCharacter("geeksforgeeks");
    }

    void firstNonRepeatingCharacter(String x) {
        int[] indexes = new int[26];

        for (char ch : x.toLowerCase().toCharArray()) {
            indexes[ch - 'a']++;
        }
        for (char ch : x.toLowerCase().toCharArray()) {
            if (indexes[ch - 'a'] == 1) {
                System.out.println("Char " + ch);
                break;
            }
        }
    }

    @Test
    void pangram() {
        pangramcheck("The quick brown fox jumps over the lazy dog");
        pangramcheck("abcdefghijklmnopqrstuvwxyz");
        pangramcheck("abcdefghijklmnopqrsuvwxyz");
    }

    void pangramcheck(String x) {
        boolean[] indexes = new boolean[26];

        for (char ch : x.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch))
                indexes[ch - 'a'] = true;
        }
        boolean isPan = true;
        for (int i = 0; i < indexes.length; i++) {
            isPan = isPan && indexes[i];
        }
        System.out.println("IS PANAGRAM :" + isPan);
    }
}
