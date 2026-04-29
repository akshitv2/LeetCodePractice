package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L028_MINIMUM_WINDOW_SUBSTRING {

    static void main() {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    public static String minWindow(String s, String t) {
        String found = null;
        Map<Character, Integer> tMap = new HashMap<>();
        for(char ch:t.toCharArray()){
            tMap.put(ch, 0);
        }
        for(int i=0;i<s.length();i++){
            if(tMap.get(s.charAt(i)) !=  null){
                tMap.put(s.charAt(i), 1);
            }
        }
        found = s;
        for(char ch:t.toCharArray()){
            if(tMap.get(ch)==0){
                found = "";
            }
        }
        if(found.length() > 0){
            minWindowRecur(s, t, tMap);
        }

        return found;
    }

    static void minWindowRecur(String s, String t, Map<Character, Integer> tMap) {
        boolean found = true;
        for(char ch:t.toCharArray()){
            if(tMap.get(ch)==0){
                found = false;
                break;
            }
        }
        if(found){
            int start = 0, end = s.length();
            for(start=0;start<s.length();start++){
                if(tMap.get(s.charAt(start)) != null) break;
            }
            for(end = s.length() -1;end > 0;end--){
                if(tMap.get(s.charAt(end)) != null) break;
            }
            System.out.println(s.substring(start, end +1));
        }


    }


}

