package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS {

    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abc"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }

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
