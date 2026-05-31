package com.practice;

import static com.leetcode.COMMON.ezprint;

public class DP_CountingPaths {
    /**
     * The 0/1 Knapsack Problem is a classic optimization problem in computer science.
     * Given a set of $n$ items, each with a specific weight and a specific value, determine the number of
     * items to include in a collection so that the total weight is less than or equal to a given limit (the knapsack's capacity)
     * and the total value is maximized.
     * The "0/1" constraint means that each item is indivisible; you must either leave it (0) or take it (1).
     * You cannot take a fractional amount of an item.
     */

    static void main() {
        System.out.println(countingPaths(3, 3));
    }

    static int countingPaths(int n, int m){
        int[][] dp= new int[n][m];

        for(int i=0;i<n;i++){
            dp[i][0] = 1;
        }

        for(int i=0;i<m;i++){
            dp[0][i] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j = 1;j<m;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        ezprint(dp);
        return dp[n-1][m-1];
    }
}
