package com.practice;

import static com.leetcode.COMMON.ezprint;

public class Array_ReverseInGroups {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(arrayRevInGroup(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3));
    }

    static int[] arrayRevInGroup(int[] arr, int k) {

        for (int i = 0; i < arr.length; i += k) {
            int start = i, end = Math.min(arr.length - 1, i + k - 1);
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
            System.out.println();
        }
        return arr;
    }
}
