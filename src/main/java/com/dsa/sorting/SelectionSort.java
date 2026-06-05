package com.dsa.sorting;

import static com.leetcode.COMMON.ezprint;

public class SelectionSort {

    /*
       select the smallest element each time and put it at it's location as you move one by one fitting the next smallest
     */

    static void main() {
//        int[] arr = new int[]{5, 3, 2, 7, 4, 1, 9, 0, 1, 4, 6};
        int[] arr = new int[]{7,2,5,9,3};
        SelectionSortThis(arr);

        ezprint(arr);
    }

    private static void SelectionSortThis(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
