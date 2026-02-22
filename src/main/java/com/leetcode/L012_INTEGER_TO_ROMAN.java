package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L012_INTEGER_TO_ROMAN {

    static void main() {
        System.out.println(intToRoman(3749));
//        System.out.println(intToRoman(2090));
        System.out.println(intToRoman(40));
    }

    public static String intToRoman(int num) {
        int[] ints = new int[]{1000, 500, 100, 50, 10, 5, 1};
        char[] chars = new char[]{'M','D','C','L','X','V','I'};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ints.length; i += 2) {
            System.out.println(num);
            int times = num / ints[i];
            num = num % ints[i];

            switch (times) {
                case 1:
                    result.append(chars[i]);
                    break;
                case 2:
                    result.append(chars[i]);
                    result.append(chars[i]);
                    break;
                case 3:
                    result.append(chars[i]);
                    result.append(chars[i]);
                    result.append(chars[i]);
                    break;
                case 4:
                    result.append(chars[i]);
                    result.append(chars[i - 1]);
                    break;
                case 5:
                    result.append(chars[i - 1]);
                    break;
                case 6:
                    result.append(chars[i - 1]);
                    result.append(chars[i]);
                    break;
                case 7:
                    result.append(chars[i - 1]);
                    result.append(chars[i]);
                    result.append(chars[i]);
                    break;
                case 8:
                    result.append(chars[i - 1]);
                    result.append(chars[i]);
                    result.append(chars[i]);
                    result.append(chars[i]);
                    break;
                case 9:
                    result.append(chars[i]);
                    result.append(chars[i - 2]);
                    break;
            }
        }
        return result.toString();
    }
}
