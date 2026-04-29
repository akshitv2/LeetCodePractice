package com.practice;

import static com.leetcode.COMMON.ezprint;

public class String_firstnonrepeating {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(fNonrep("racecar"));
    }

    static char fNonrep(String s) {
        int ind[] = new int[26];
        for(int i=0;i<ind.length;i++) ind[i] = -1;
        int starter = 97;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ind[ch-starter] > 0){
                ind[ch-starter] = 1000;
            }else{
                ind[ch-starter] = i;
            }
        }
        int minChar = ind[s.charAt(0)-starter];
        int finIndex = 0;
        for(int i=0;i<ind.length;i++){
            if(ind[i]<minChar && ind[i] != -1){
                finIndex = i;
                minChar = ind[i];
            }
        }
        ezprint(ind);
        return (char)(starter + finIndex);
    }
}
