package com.dsa.arrays;

import java.util.Arrays;

import static com.leetcode.COMMON.ezprint;

public class SubstringKMP {

    static void main() {

//        String[] strings = new String[]{"AABAAAX", "XABYABZ",  "ABABAC", "AAACAAA", "AAAAAAB","ABXABYABXAX","ABXADABXAB"};
        String p = "AAAAAAAAAAAAAAAAAB";
        String t = "AAAB";
        System.out.println(KMP(p,t));
    }

    static boolean KMP(String p, String t){
        int[] lps = lpsArr(t);
        int tn = t.length();
        int j = 0, i =0;
        ezprint(lps);

        while(i<p.length() && j < tn){
            if(p.charAt(i) == t.charAt(j)){
                i++;
                j++;
                if(j == tn) return true;
            }else{
                if (j != 0) {
                    j = lps[j - 1]; // Fallback using LPS array
                } else {
                    i++; // No match possible at current 'i', move text pointer
                }
            }
        }
        return false;
    }

    static int[] lpsArr(String t) {
        int n = t.length(), j;
        int[] lps = new int[n];
        int len = 0;

        for (int i = 1; i < n; i++) {
            char x = t.charAt(i);

            // Backtrack while there is a mismatch
            while (len > 0 && x != t.charAt(len)) {
                len = lps[len - 1];
            }

            // If characters match, increment length
            if (x == t.charAt(len)) {
                len++;
            }

            lps[i] = len;
        }

        ezprint(lps);
        return lps;
    }

    static  int[] lpsLegacy(String t) {
        int[] lps = new int[t.length()];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < t.length()) {
            char x = t.charAt(i);
            if (t.charAt(i) == t.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // Backtrack to the previous longest prefix suffix
                    len = lps[len - 1];
                } else {
                    // No prefix matches, move to the next character
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
