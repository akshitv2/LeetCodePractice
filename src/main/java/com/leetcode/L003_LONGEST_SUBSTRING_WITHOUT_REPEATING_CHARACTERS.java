package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS {

    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abc"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    /**
     * Calculates the length of the longest substring without repeating characters.
     * * <p>This method uses a sliding window approach with an integer array to track the
     * last seen positions of characters. This allows the window's start pointer to
     * "jump" forward when a duplicate is encountered, ensuring O(n) time complexity.</p>
     *
     * @param s The input string to evaluate.
     * @return The length of the longest contiguous substring containing only unique characters.
     * @throws NullPointerException if the input string is null.
     */
    public static int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int maxLen = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            start = Math.max(start, lastSeen[ch]);
            maxLen = Math.max(maxLen, end - start + 1);
            lastSeen[ch] = end + 1;
        }
        return maxLen;
    }
}
