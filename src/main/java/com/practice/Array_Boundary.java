package com.practice;

public class Array_Boundary {
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
        bound(matx);
    }

    static void bound(int[][] arr) {

        int x = 0, y =0;
        int mx = 0, my = 1;
        int stride = arr.length;
        for(int i=0;i< arr.length*4;i++){
            System.out.println(arr[x][y]);
            if(x == 0 && y == arr.length-1){
                mx =1;
                my = 0;
            }
            if(x == arr.length-1 && y == arr.length-1){
                mx =0;
                my = -1;
            }
            if(x == arr.length-1 && y == 0){
                mx =-1;
                my = 0;
            }
            x+=mx;
            y+=my;
            if(x==0 && y==0) break;
        }
    }
}
