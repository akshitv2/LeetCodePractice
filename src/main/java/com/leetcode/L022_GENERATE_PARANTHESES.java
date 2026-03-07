package com.leetcode;

import java.util.*;

import static com.leetcode.COMMON.print;

public class L022_GENERATE_PARANTHESES {

    static void main() {
        print(generateParenthesis(4));
    }


    public static List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        generatePar(n,0,0,  answer, new StringBuilder());
        return answer;
    }

    public static void generatePar(int n, int opens, int closed, List<String> res, StringBuilder cur) {
        if(opens == n){
            if(closed == n) {
                res.add(cur.toString());
            }else{
                generatePar(n,n, closed+1,res, cur.append(")"));
                cur.deleteCharAt(n+closed);
            }
        }else{
            if(opens>closed) {
                generatePar(n, opens, closed+1, res, cur.append(')'));
                cur.deleteCharAt(opens+closed);
            }
            generatePar(n, opens+1, closed, res, cur.append('('));
            cur.deleteCharAt(opens+closed);
        }
    }
}
