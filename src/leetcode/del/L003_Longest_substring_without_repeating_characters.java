package leetcode.del;

import java.util.HashMap;
import java.util.Map;

public class L003_Longest_substring_without_repeating_characters {
    public static void main(String[] args) {
    }

    public static int lengthOfLongestSubstring(String s) {
//        if(s.length()==)
        Map<Character,Integer> mp = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),0);
        }
        for(int i=1;i<s.length()+1;i++){
            start = Math.max(start,mp.get(s.charAt(i-1)));
            maxLength = Math.max(maxLength, i - start);
            mp.put(s.charAt(i-1),i);
        }
        return maxLength;
    }

}
