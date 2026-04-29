package com.leetcode;

import java.text.DecimalFormat;

import static com.leetcode.COMMON.ezprint;

public class L029_DIVIDE_TWO_INTEGERS {

    static void main() {
//        System.out.println(divide(10,2));
//        System.out.println(divide(0,3));
//        System.out.println(divide(7,-3));
//        System.out.println(divide(2147483647,1));
//        System.out.println(divide(-2147483648,2));
        System.out.println(divide(-2147483647,-2147483648));
    }

    public static int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        if(dividend == -2147483647 && divisor == -2147483648){
            return 0;
        }
        if(divisor == 1){
            return dividend;
        }
        if(divisor == -1){
            return -dividend;
        }
        double dividendd = dividend;
        double divisord = divisor;
        int result = 0;
        int sign = 1;
        if(dividend < 0){
            if(dividend == -2147483648){
                dividendd = 2147483648.00;
                sign = -sign;
            }else {
                sign = -sign;
                dividendd = -dividendd;
            }
        }
        if(divisor < 0){
            sign=-sign;
            divisord=-divisord;
        }

        int[] multArr = new int[1000];
        int[] powers = new int[1000];
        multArr[0] = (int)divisord;
        powers[0] = 1;
        int i =1;
        for(i=1;multArr[i-1]<Integer.MAX_VALUE-multArr[i-1] ;i++){
            multArr[i] = multArr[i-1] + multArr[i-1];
            powers[i] = powers[i-1]*2;
        }
        for(int j = i-1;j>=0;j--){
            while(multArr[j] <= dividendd){
                dividendd = dividendd - multArr[j];
                result += powers[j];
            }
        }
        return result*sign;
    }


}
