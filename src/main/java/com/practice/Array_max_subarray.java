package com.practice;

import java.util.ArrayList;

import static com.leetcode.COMMON.ezprint;

public class Array_max_subarray {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
//        ezprint(maxSub(new int[]{1, 2, 3}));
//        ezprint(maxSub(new int[]{2, 4, 1, 7, 5, 0}));
//        ezprint(maxSub(new int[]{1, 3, 5, 4, 2}));
        ezprint(maxSub(new int[]{2, 3, -8, 7, -1, 2, 3}));
        ezprint(maxSub(new int[]{2, 3, -8, 7, -1, 2, 3,-30}));
        ezprint(maxSub(new int[]{5, 4, 1, 7, 8}));
    }

    static int maxSub(int[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int maxn = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(arr[i]);
            maxn = Math.max(maxn, arr[i]);
            for(int x:integerArrayList){
                newList.add(x+arr[i]);
                maxn = Math.max(maxn, x+arr[i]);
            }
            integerArrayList = newList;

        }
        ezprint(integerArrayList);
        return maxn;
    }
}
