package leetcode;

public class L007_Reverse_Integer {
    public static void main(String[] args) {
//        System.out.println(reverse(-123));
//        System.out.println(reverse(2147483647));
//        System.out.println(reverse(10));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        if(x == -2147483648) return 0;
        int sign = 1;
        if(x < 0){
            x = -1*x;
            sign = -1;
        }
        int newInt = 0;
        while(x>=10){
            newInt = newInt*10 + x%10;
            x = x/10;
        }

        if(newInt> 214748364 || (newInt == 214748364 && x>7)){
            return 0;
        }
        newInt = newInt * 10 + x%10;
        return newInt*sign;
    }
}
