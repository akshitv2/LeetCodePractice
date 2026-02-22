package com.leetcode;

public class L006_ZIGZAG_CONVERSION {

    static void main() {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String sx, int numRows) {
        char[] s = sx.toCharArray();
        int n = s.length;
        if(numRows == 1) return sx;
        char[] answer = new char[n];
        int index = 0;
        int f = 2*(numRows-1);
        for(int i=0;i<numRows;i++){
            if(i==0 || i==numRows-1){
                for(int j=i;j<n;j+=f){
                    answer[index++] = s[j];
                }
            }else{
                int downShift = f - 2*i;
                int upShift = f - 2*(numRows - i - 1);
                boolean goingDown = false;
                for(int j=i;j<n;j+=goingDown?downShift:upShift){
                    answer[index++] = s[j];
                    goingDown = !goingDown;
                }
            }
        }
        return new String(answer);
    }
}
