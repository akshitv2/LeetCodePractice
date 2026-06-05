package com.dsa.sorting;

import static com.leetcode.COMMON.ezprint;

public class InsertionSort {

    /*
    Works by picking elements one by one and inserting in the right place in the sort
    We call the left of i as sorted, insertion happens by finding its right place and not swapping but shifting everything as we go

     */

    static void main() {
//        int[] arr = new int[]{5, 3, 2, 7, 4, 1, 9, 0, 1, 4, 6};
        int[] arr = new int[]{7,2,5,9,3};
        InsertionSortThis(arr);

        ezprint(arr);
    }

    private static void InsertionSortThis(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0  && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            ezprint(arr);
        }
    }

}
