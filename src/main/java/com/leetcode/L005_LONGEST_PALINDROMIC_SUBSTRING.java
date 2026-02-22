package com.leetcode;

public class L005_LONGEST_PALINDROMIC_SUBSTRING {

    static void main() {
        System.out.println(longestPalindrome("abba"));
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (s == null || start < 0 || end >= s.length() || start > end) {
            return false;
        }

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    /**
     * Finds the longest palindromic substring within a given string.
     * * <p>The algorithm iterates through each character as a potential center
     * and expands outwards to check for the longest odd-length and
     * even-length palindromes. It uses internal optimization to skip
     * expansions lower in length than current maxlength {@code maxLength}.</p>
     *
     * @param s The string to search for palindromes.
     * @return The longest palindromic substring found. Returns the original
     * string if its length is less than 2.
     * @throws NullPointerException if {@code s} is null.
     */
    public static String longestPalindrome(String s) {
        int maxLength = 0;
        String answer = "";
        int start = 0, end = 0;
        if (s.length() < 2) return s;
        for (int i = 0; i < s.length(); i++) {
            int j = maxLength / 2;
            while (i + j < s.length() && i - j >= 0 && s.charAt(i + j) == s.charAt(i - j)) {
                j++;
            }
            j--;
            if (j >= maxLength / 2) {
                if (isPalindrome(s, i - j, i + j) && 2 * j + 1 > maxLength) {
                    maxLength = 2 * j + 1;//substr.length();
                    start = i - j;
                    end = i + j + 1;

                }
            }
            j = maxLength / 2;
            while (i + j + 1 < s.length() && i - j >= 0 && s.charAt(i + j + 1) == s.charAt(i - j)) {
                j++;
            }
            j--;
            if (j >= maxLength / 2) {
                if (isPalindrome(s, i - j, i + j + 1) && 2 * j + 2 > maxLength) {
                    maxLength = 2 * j + 2;//substr.length();
                    start = i - j;
                    end = i + j + 2;
                }
            }
        }
        return s.substring(start, end);
    }
}
