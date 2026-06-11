package com.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.COMMON.ezprint;

public class ArraysProbs {

    static void main() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        revArray(arr);
        rotateArrayWithoutCollections(arr, 3);
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

    static void revArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        System.out.println("BEFORE");
        ezprint(arr);
        while (start < end) {
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


    static void rotateArray(int[] arr, int t) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(arr[i]);
        }
        for (int i = t; i < n; i++) {
            list.add(arr[i]);
            arr[i] = list.removeFirst();
        }
        for (int i = 0; !list.isEmpty(); i++) {
            arr[i] = list.removeFirst();
        }
        ezprint(arr);
    }

    static int[] rotateArrayWithoutCollections(int[] arr, int t) {
        System.out.println("BEFORE");
        ezprint(arr);
        int n = arr.length;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[(i + t) % n] = arr[i];
        }
        System.out.println("AFTER");
        ezprint(newArr);
        return newArr;
    }

    static void generateAllSubarrays(int[] arr, int t, ArrayList<Integer> arrayList) {
        if (t == 0) {
            for (int i = 0; i < arr.length; i++) {
                arrayList = new ArrayList<>();
                arrayList.add(arr[i]);
                ezprint(arrayList);
                generateAllSubarrays(arr, i + 1, arrayList);
            }
        } else if (t == arr.length) return;
        else {
            arrayList.add(arr[t]);
            ezprint(arrayList);

            generateAllSubarrays(arr, t + 1, arrayList);
        }
    }

    static void generateAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                sub.add(arr[j]);
                ezprint(sub); // Prints every contiguous subarray
            }
        }
    }

    static void rearrangeBySign(int[] arr) {
        int neg = 0, pos = 0;
        boolean negFlag = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (negFlag) {
                for (; neg < arr.length; neg++) {
                    if (arr[neg] < 0) {
                        list.add(arr[neg++]);
                        negFlag = !negFlag;
                        break;

                    }
                }
            } else {
                for (; pos < arr.length; pos++) {
                    if (arr[pos] >= 0) {
                        list.add(arr[pos++]);
                        negFlag = !negFlag;
                        break;
                    }
                }
            }
        }
        for (; neg < arr.length; neg++) {
            if (arr[neg] < 0) {
                list.add(arr[neg]);
            }
        }
        for (; pos < arr.length; pos++) {
            if (arr[pos] >= 0) {
                list.add(arr[pos]);
            }
        }
        ezprint(list);
    }

    static void maxStockMultiTrans(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        System.out.println(profit);
    }

    @Test
    void generateAllSub() {
//        generateAllSubarrays(new int[]{1, 2, 3}, 0, new ArrayList<>());
        generateAllSubarrays(new int[]{1, 2, 3});
    }

    @Test
    void rearrangeBySign() {
        rearrangeBySign(new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8});
    }

    @Test
    void maxStockMultiTrans() {
        maxStockMultiTrans(new int[]{100, 180, 260, 310, 40, 535, 695});
        maxStockMultiTrans(new int[]{100, 200, 150, 300});
    }

    @Test
    void morethannby2() {
        moreThanNBy2MOOREVOTING(new int[]{1, 1, 1, 2, 2, 2, 2});
        moreThanNBy2MOOREVOTING(new int[]{1, 1, 1, 2, 2, 2});
        moreThanNBy2MOOREVOTING(new int[]{1, 2,3,4,5});
    }

    void moreThanNBy2MOOREVOTING(int[] arr) {
        int n = arr.length;
        int candidate = arr[0], votes = 1;
        for (int i = 1; i < arr.length; i++) {
            if (votes == 0) {
                candidate = arr[i];
                votes=1;
            } else if (arr[i] == candidate) {
                votes++;
            } else {
                votes--;
            }
        }
        votes = 0;
        for(int i:arr){
            if(i == candidate) votes++;
        }
        if( votes > arr.length/2){
            System.out.println("Majority Element :" +candidate);
        }


    }
}
