package leetcode.del;

public class L008_String_to_integer {
    public static void main(String[] args) {
//        System.out.println(reverse(-123));
//        System.out.println(reverse(2147483647));
//        System.out.println(reverse(10));
        System.out.println((int) '-');
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -042"));
        System.out.println(myAtoi("019"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
    }

    public static int myAtoi(String s) {
        double number = 0;
        boolean negative = false, start = false;
        for (int x : s.toCharArray()) {
            if (x == 32 && !start) continue;
            if (x == 43 && !start) {
                negative = false;
                start = true;
                continue;
            }
            if (x == 45 && !start) {
                negative = true;
                start = true;
                continue;
            }
            if (x >= 48 && x <= 57) {
                number = number * 10 + (x - 48);
                start = true;
            } else {
                break;
            }
        }
        if (negative) number = number * -1;
        if (number < -2147483648) return -2147483648;
        if (number > 2147483647) return 2147483647;
        return (int) number;
    }

}
