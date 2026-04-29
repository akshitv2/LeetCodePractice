package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

import static com.leetcode.COMMON.ezprint;

public class Array_SumAllSub {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(sumAllsub(new int[]{1, 2, 3}));
        ezprint(sumAllsub(new int[]{1, 4, 5, 3, 2}));
//        ezprint(sumAllsub(new int[]{2, 4, 1, 7, 5, 0}));
//        ezprint(sumAllsub(new int[]{1, 3, 5, 4, 2}));
    }

    static int sumAllsub(int[] arr) {
        int[] sumList = new int[10000];
        int k=0; int j =0;
        for(int i=0;i<arr.length;i++){
            sumList[k++] = arr[i];
        }
        int finsum = 0;
        System.out.println(finsum);

        return 0;
    }
}
