package com.practice;

import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class Array_ArrayBySign {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(arraybysign(new int[]{1, 2, 3, -3, -4}));
    }

    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] arraybysign(int[] arr) {
        int neg = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]/Math.abs(arr[i]) != neg) {
                int jx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j]/Math.abs(arr[j]) == neg){
                        jx = j;
                        break;
                    }else{
                        swap(i,j,arr);
                    }
                }
                swap(i,jx, arr);
            }
            neg = -1*neg;
        }

        return arr;
    }
}
