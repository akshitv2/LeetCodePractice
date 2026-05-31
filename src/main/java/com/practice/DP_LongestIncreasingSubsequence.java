package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DP_LongestIncreasingSubsequence {
    /**
     * You are given an array containing N integers. Your task is to determine the LIS in the array, i.e., a subsequence where every element is larger than the previous one.
     */

    static void main() {
        System.out.println(LIS(new int[]{10,22,9,33,21,50}));
    }

    static int LIS(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        int maxn = 0;
        for(int i=0;i<n;i++){
            maxn = Math.max(maxn, dp[i]);
        }
        return maxn;
    }
}
