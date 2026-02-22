package com.leetcode.del;

public class L005_Longest_Palindromic_substring {
    public static void main(String[] args) {
        System.out.println("Hello".substring(0,1));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("geeksskeeg"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("c"));
    }

    public static String longestPalindrome(String s) {
        String res = "";int num = s.length();
        for(int i =0;i<s.length();i++){
            int j =i,k=i;
            while(j>-1 && k < num && s.charAt(k)== s.charAt(j)){
                j--; k++;
            }
            j++;
            if(s.substring(j,k).length()> res.length()){
                res = s.substring(j,k);
            }
        }

        for(int i =0;i<s.length()-1;i++){
            int j =i,k=i+1;
            while(j>-1 && k < num && s.charAt(k)== s.charAt(j)){
                j--; k++;
            }
            j++;
            if(s.substring(j,k).length()> res.length()){
                res = s.substring(j,k);
            }
        }
        return res;
    }

}
