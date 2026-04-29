package com.practice;

public class Array_MinMax {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        int[] arr = {6, 4, 2, -2, 5, 3, 2, 2, -1, -1, 4};
        minmix(arr);
    }

    static void minmix(int[] arr) {
        int[] lasts = new int[2];
        for(int i=0;i<arr.length;i++){
            if(i>1){
                if(lasts[0]>lasts[1] && arr[i]>lasts[1]){
                    System.out.println("MIN " + lasts[1]);
                }
                if(lasts[0]<lasts[1] && arr[i]<lasts[1]){
                    System.out.println("MAX " + lasts[1]);
                }
            }
            if(arr[i] == lasts[1]){
                continue;
            }
            lasts[0] = lasts[1];
            lasts[1] = arr[i];
        }
    }
}
