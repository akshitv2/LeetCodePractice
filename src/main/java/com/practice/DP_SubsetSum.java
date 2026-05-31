package com.practice;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class DP_SubsetSum {
    /**
     * Given $N$ integers and $T$, determine whether there exists a subset of the given set whose elements sum up to the $T$.
     */

    static void main() {
        System.out.println(subsetSum(5,11,new int[]{3,34,4,12,5}));
        System.out.println(subsetSum(5, 9, new int[]{3, 34, 4, 12, 5}));
    }

    static boolean getDP(boolean[][] dp, int i, int j) {
        if (i < 0 || j < 0) {
            return false;
        } else {
            return dp[i][j];
        }
    }

    static boolean subsetSum(int n, int t, int[] nums) {
        boolean[][] dp = new boolean[n+1][t+1];
        dp[0][0] = true;
        for(int i=1;i<n+1;i++) {
            for (int ti = 0; ti <= t; ti++) {
                dp[i][ti] = dp[i - 1][ti] || getDP(dp, i - 1, ti - nums[i - 1]);
            }
        }
//        ezprint(dp, new int[]{0,3, 34, 4, 12, 5} , new int[]{0, 1,2,3,4,5,6,7,8,9});
        return dp[n][t];
    }
}
