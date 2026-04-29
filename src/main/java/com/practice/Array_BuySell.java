package com.practice;

import static com.leetcode.COMMON.ezprint;

public class Array_BuySell {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
//        ezprint(bysellb(new int[]{7, 10, 1, 3, 6, 9, 2}));
        ezprint(bysellb(new int[]{100, 180, 260, 310, 40, 535, 695}));
    }

    static int bysell(int[] arr) {
        int maxNum = 0;
        int profit = -1000;
        for (int i = arr.length - 1; i >= 0; i--) {
            maxNum = Math.max(arr[i], maxNum);
            profit = Math.max(profit, maxNum - arr[i]);
        }
        return profit;
    }

    static int bysellb(int[] arr) {
        int maxNum = arr.length - 1;
        int profit = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            maxNum = Math.max(arr[i], maxNum);
            if (arr[i] < maxNum) {
                profit += maxNum - arr[i];
                maxNum = arr[i];
            }
        }
        return profit;
    }
}
