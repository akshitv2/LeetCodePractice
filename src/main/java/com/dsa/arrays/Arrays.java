package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class Arrays {

    static void main() {
        int[] arr = new int[]{1,2,3,4,5,6,7};
//        revArray(arr);
        rotateArray(arr, 3);
    }


    static void declare() {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr1 = new int[5];

//        Collections
        List<Integer> array = new ArrayList();
        array.add(1);
        array.add(2);
    }

    //
    static void issortedTest() {
        int[] arr = new int[]{1, 23, 3, 4, 6};
        int[] arr1 = new int[]{1, 2, 3, 4, 6};
        System.out.println(issorted(arr1));
    }

    static boolean issorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    //

    static void revArray(int[] arr){
        int start =0, end = arr.length-1;
        System.out.println("BEFORE");
        ezprint(arr);
        while (start< end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        System.out.println("AFTER");
        ezprint(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void rotateArray(int[] arr, int t){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(arr[i]);
        }
        for(int i=t;i<n;i++){
            list.add(arr[i]);
            arr[i] = list.removeFirst();
        }
        for(int i=0;!list.isEmpty();i++){
            arr[i] = list.removeFirst();
        }
        ezprint(arr);
    }
}
