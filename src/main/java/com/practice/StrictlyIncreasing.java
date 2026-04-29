package com.practice;

import static com.leetcode.COMMON.ezprint;

public class StrictlyIncreasing {
    /*
    Given an array arr[] of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in O(n) time. If there are multiple such triplets, then print any one of them.
     */

    static void main() {
        ezprint(strictIncreaseRecur(new int[]{1,3,4,2,5}, 1, false));
        ezprint(strictIncreaseRecur(new int[]{1,2,3,4,5,6}, 1, false));

    }

    static int strictIncreaseRecurx(int[] arr, int k, boolean Inseq) {
        int seqNum = 0;
//        if(Inseq) seqNum++;
        if(k< arr.length) {
            if (arr[k - 1] < arr[k]) {
                seqNum+=1;
                seqNum += strictIncreaseRecur(arr, k + 1, true);
            }
            seqNum += strictIncreaseRecur(arr, k + 1, false);
        }
        return seqNum;
    }

    static int strictIncreaseRecur(int[] arr, int k, boolean Inseq) {
        int[] ind = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                ind[i] = ind[i-1]+1;
                ind[i-1] = 0;
            }
        }
        int fin = 0;
        for(int i=0;i<arr.length;i++){
            for(;ind[i]>0;ind[i]--){
                fin+=ind[i];
            }
        }
        return fin;
    }
}
