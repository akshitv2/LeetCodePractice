package com.leetcode;

public class L007_REVERSE_INTEGER {

    static void main() {
    }


    public static int reverse(int x) {
        if (x == -2147483648) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            x = -x;
            sign = -1;
        }
        int finalAnswer = 0;
        while (x >= 10) {
            finalAnswer = finalAnswer * 10 + x % 10;
            x = x / 10;
        }
        if ((finalAnswer > 214748364) || (finalAnswer == 214748364 && x > 7)) {
            return 0;
        } else {
            finalAnswer = finalAnswer * 10 + x % 10;
        }
        return sign * finalAnswer;
    }
}
