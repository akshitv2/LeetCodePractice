package leetcode.del;

public class L006_Zigzag_conversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) sb[i] = new StringBuilder();

        boolean zig = false;
        int index = 0, addn = 1;

        for (int i = 0; i < s.length(); i++) {
            if (!zig && index == numRows-1) {
                zig = true;
                addn = -1;
            }else if( zig && index == 0){
                zig = false;
                addn = 1;
            }
            sb[index].append(s.charAt(i));
            index +=addn;
        }
        StringBuilder finale = new StringBuilder();
        for(StringBuilder sx:sb){
            finale.append(sx);
        }
        return finale.toString();
    }

}
