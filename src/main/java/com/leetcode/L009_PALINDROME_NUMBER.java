package com.leetcode;

public class L009_PALINDROME_NUMBER {

    static void main() {
        int num = 121;
//        int num = 123891238;

        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome(191238));
    }

    //double reversal
    public static boolean isPalindromeA(int x) {
        if (x < 0)
            return false;

        double rev = 0, orig = x;

        while (x > 0) {
            rev*=10;
            rev = rev + x % 10;
            x = x/10;
        }
        return rev == orig;
    }

    //string method
    public static boolean isPalindromeB(int x) {
        if (x < 0)
            return false;
        String strNum = String.valueOf(x);
        int front_index = 0, back_index = strNum.length()-1;
        while(front_index < back_index){
            if(strNum.charAt(front_index) != strNum.charAt(back_index)){
                return false;
            }
            front_index++;
            back_index--;
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String strNum = String.valueOf(x);
        int front_index = 0, back_index = strNum.length()-1;
        while(front_index < back_index){
            if(strNum.charAt(front_index) != strNum.charAt(back_index)){
                return false;
            }
            front_index++;
            back_index--;
        }
        return true;
    }
}
