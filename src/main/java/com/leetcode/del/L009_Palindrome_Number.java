package com.leetcode.del;

public class L009_Palindrome_Number {
    public static void main(String[] args) {
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int xx = x;
        int newPow = 0;
        while(x>0){
            newPow = newPow * 10 + x % 10;
            x = x / 10;
        }
        return xx == newPow;
    }

}
