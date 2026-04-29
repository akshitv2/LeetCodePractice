package com.practice;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class Array_DiagonalTraversal {
    /*
    Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place.
    If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
     */

    static void main() {
        int[][] matx = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matxx = {
                {1, 2},
                {4, 5},
        };
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        diag(mat, new ArrayList(), -1);
    }

    static void diag(int[][] arr, List arx, int k) {

        int x = 0, y = 0;
        for (int i = 0; i < arr.length * 2 - 1; i++) {
            x = i - Math.min(i, arr.length - 1);
            y = Math.min(i, arr.length - 1);
            System.out.println("X :" + x + "Y: " + y + " :" + arr[x][y]);
            while (y > 0 && x < arr.length - 1) {
                y--;
                x++;
                System.out.println("X :" + x + "Y: " + y + " :" + arr[x][y]);
            }
        }
    }
}
