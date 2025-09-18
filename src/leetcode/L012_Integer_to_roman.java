package leetcode;

import java.util.HashMap;
import java.util.Set;

public class L012_Integer_to_roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] placesArray = new int[]{1000, 100, 10, 1};
        char[] fiveArray = new char[]{' ','D','L','V'};
        char[] charArray = new char[]{'M','C','X','I'};
        for (int i = 0; i < placesArray.length; i++) {
            int toPut = (num/placesArray[i])%10;
            if(toPut == 4){
                result.append(charArray[i]);
                result.append(fiveArray[i]);
            }else if(toPut == 9){
                result.append(charArray[i]);
                result.append(charArray[i-1]);
            }else{
                if(toPut>=5) result.append(fiveArray[i]);
                for(int j=0;j<toPut%5;j++){
                    result.append(charArray[i]);
                }
            }
        }
        return result.toString();
    }

}
