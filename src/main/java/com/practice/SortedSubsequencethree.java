package com.practice;

import static com.leetcode.COMMON.ezprint;

public class SortedSubsequencethree {
    /*
    Given an array arr[] of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in O(n) time. If there are multiple such triplets, then print any one of them.
     */

    static void main() {
        ezprint(sortedSub(new int[]{12, 11, 10, 5, 6, 2, 30}));
    }

    static int sortedSub(int[] arr) {

        int[] greaters = new int[arr.length];
        int[] smallers = new int[arr.length];

        int min = 10000;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            smallers[i] = min;
        }

        int max = -1;
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(arr[i], max);
            greaters[j++] = max;
        }
//        ezprint(smallers);
//        ezprint(arr);
//        ezprint(greaters);

        for (int i = 0; i < arr.length; i++) {
            if (smallers[i] < arr[i] && arr[i] < greaters[i]) {
                System.out.println(smallers[i] + " " + arr[i] + " " + greaters[i]);
            }
        }
        return 0;
    }
}
