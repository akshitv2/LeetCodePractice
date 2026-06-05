package com.dsa.sorting;

import static com.leetcode.COMMON.ezprint;

public class BubbleSort {

    /*
    works by repeatedly swapping adjacent elements that are out of order, using a swap flag to terminate early and
    achieve $O(n)$ time complexity if the array becomes fully sorted before all passes are complete.
     */
    /*
    Called Bubble Sort because the largest elements gradually "bubble up" to the top
     */

    static void main() {
        int[] arr = new int[]{5, 3, 2, 7, 4, 1, 9, 0, 1, 4, 6};
        BubbleSortThis(arr);

        ezprint(arr);
    }

    private static void BubbleSortThis(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }

}
