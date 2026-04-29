package com.practice;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class Array_AllSubarrays {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(allsubarrays(new int[]{1, 2, 3},new ArrayList(), -1));
    }

    static int[] allsubarrays(int[] arr, List arx, int k) {
//        if(k==arr.length-1){
//            ezprint(arx);
//        }
        ezprint(arx);

        for(int i=k+1;i<arr.length;i++){
            arx.addLast(arr[i]);
            allsubarrays(arr,  arx,i);
            arx.removeLast();
        }

        return arr;
    }
}
