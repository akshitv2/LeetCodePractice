package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L078_MINIMUM_WINDOW_SUBSTRING {

    static void main() {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t){
        Map<Character, Integer> hmap = new HashMap<>();
        for(char tx:t.toCharArray()){
            hmap.put(tx, -1);
        }
        String solution = s;
//        for()

        for(int i=0;i<s.length();i++){
            char tx = s.charAt(i);
            if(hmap.get(tx)!=null){
                hmap.put(tx, i);
                boolean allcovered = true;
                int start = hmap.get(tx),end = hmap.get(tx);
                for(char xx:t.toCharArray()){
                    if(hmap.get(xx) == -1) allcovered = false;
                    start = Math.min(start, hmap.get(xx));
                    end = Math.max(end, hmap.get(xx));
                }
                if(allcovered){
                    String newString = s.substring(start, end+1);
                    if(newString.length()<solution.length()){
                        solution = newString;
                    }
                }
            }
        }
        return solution;
    }

}
