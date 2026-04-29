package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.leetcode.COMMON.ezprint;

public class Array_NextPerm {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        ezprint(nextPerm(new int[]{1, 2, 3}));
        ezprint(nextPerm(new int[]{2, 4, 1, 7, 5, 0}));
        ezprint(nextPerm(new int[]{1, 3, 5, 4, 2}));
    }

    static int[] nextPerm(int[] arr) {
//        Map<Integer, Integer> indMap = new HashMap<>();
        int[] indMap = new int[10];

        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i]+1;j<10;j++){
                if(indMap[j]>0){
                    indMap[arr[i]]++;
                    indMap[j]--;
                    arr[i] = j;
                    for(int xi=i+1;xi<arr.length;xi++){
                        for(int k=0;k<indMap.length;k++){
                            if(indMap[k] >0){
                                indMap[k]--;
                                arr[xi] = k;
                                break;
                            }
                        }
                    }
                    return arr;
                }
            }
            indMap[arr[i]]++;
        }
        return arr;
    }
}
