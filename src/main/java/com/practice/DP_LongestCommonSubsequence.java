package com.practice;

import static com.leetcode.COMMON.ezprint;

public class DP_LongestCommonSubsequence {
    /**
     * You are given strings 
     * $s$ and 
     * $t$. Find the length of the longest string that is a subsequence of both 
     * $s$ and 
     * $t$.
     */

    static void main() {
        System.out.println(lcd("ABCDE", "ABCE"));
        System.out.println(lcd("ABAZDC", "BACBAD"));
        System.out.println(lcd("AAB", "ABAZ"));
    }

    static int getDP(int[][] dp, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        } else {
            return dp[i][j];
        }
    }

    static int lcd(String a, String b){
        int an = a.length();
        int bn = b.length();

        int[][] dp = new int[an][bn];

        for(int i=0; i< an;i++){
            for(int j=0;j<bn;j++){

                if(a.charAt(i) == b.charAt(j)){
                    dp[i][j] =getDP(dp, i-1,j-1)+1;
                }else{
                    dp[i][j] = Math.max(getDP(dp, i,j-1), getDP(dp, i-1,j));
                }
            }
        }

        ezprint(dp);
        return dp[an-1][bn-1];
    }
}
