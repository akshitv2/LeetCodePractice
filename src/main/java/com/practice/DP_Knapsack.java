package com.practice;

import static com.leetcode.COMMON.ezprint;

public class DP_Knapsack {
    /**
     * The 0/1 Knapsack Problem is a classic optimization problem in computer science.
     * Given a set of $n$ items, each with a specific weight and a specific value, determine the number of
     * items to include in a collection so that the total weight is less than or equal to a given limit (the knapsack's capacity)
     * and the total value is maximized.
     * The "0/1" constraint means that each item is indivisible; you must either leave it (0) or take it (1).
     * You cannot take a fractional amount of an item.
     */

    static void main() {
        System.out.println(knapsack(new int[]{2, 3, 4, 5}, new int[]{1, 2, 5, 6}, 8));
    }

    static int getDP(int[][] dp, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        } else {
            return dp[i][j];
        }
    }

    static int knapsack(int[] weights, int[] values, int capacity) {
        int[][] dp = new int[values.length][capacity + 1];

        for (int i = 0; i < weights.length; i++) {
            for (int curCap = 1; curCap <= capacity; curCap++) {
                if (curCap - weights[i] >= 0) {
                    dp[i][curCap] = Math.max(getDP(dp, i - 1, curCap), getDP(dp, i - 1, curCap - weights[i]) + values[i]);
                } else {
                    dp[i][curCap] = getDP(dp, i - 1, curCap);
                }
            }
        }

        ezprint(dp, new int[]{1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        return dp[values.length - 1][capacity];
    }
}
