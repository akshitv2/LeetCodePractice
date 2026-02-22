package com.leetcode;

public class L006_ZIGZAG_CONVERSION {

    static void main() {
        System.out.println(convert("PAYPALISHIRING", 3));
    }


    /**
     * Transforms a string into a ZigZag pattern across a defined number of rows
     * and reads the result row-by-row.
     * * <h3>Logic & Algorithm:</h3>
     * The method maps the linear input string into a periodic "V" shape pattern.
     * Instead of using a 2D grid, it calculates the index jumps mathematically:
     * <ul>
     * <li><b>Full Cycle (f):</b> The distance between the tops of two adjacent "V" shapes,
     * calculated as {@code 2 * (numRows - 1)}.</li>
     * <li><b>Boundary Rows (First and Last):</b> Characters are spaced exactly {@code f} apart.</li>
     * <li><b>Inner Rows:</b> Characters are spaced using alternating "downShift" and "upShift"
     * intervals.
     * <ul>
     * <li>{@code downShift = f - 2*i}</li>
     * <li>{@code upShift = f - 2*(numRows - i - 1)}</li>
     * </ul>
     * The algorithm toggles between these shifts to capture both the downward
     * and upward strokes of the ZigZag.
     * </ul>
     * *
     * * @param sx      The input string to be rearranged.
     * @param numRows The number of rows for the pattern.
     * @return        The resulting string after row-by-row concatenation.
     */
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
