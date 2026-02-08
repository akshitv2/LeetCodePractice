package leetcode;

public class L014_LONGEST_COMMON_PREFIX {

    static void main() {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        int maxLength = 999999999;
        for(String s:strs){
            maxLength = Math.min(s.length(), maxLength);
        }

        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<maxLength;i++){
            char comm = strs[0].charAt(i);
            for(String s:strs){
                if(comm!=s.charAt(i)){
                    return prefix.toString();
                }
            }
            prefix.append(comm);
        }
        return prefix.toString();
    }
}
