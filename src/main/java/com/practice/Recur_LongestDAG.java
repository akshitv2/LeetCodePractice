//package com.practice;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static com.leetcode.COMMON.ezprint;
//
//public class Recur_LongestDAG {
//    /**
//     * You are given a directed acyclic graph (DAG) consisting of $N$ vertices and $M$ directed edges. Each edge $(u, v)$ has an associated weight $W$.Your task is to find the maximum possible total weight of a directed path in the graph. A path can start at any vertex and end at any vertex, as long as it follows the direction of the edges.
//     */
//
//    static void main() {
////        int[][] arr = {{1, 2, 3}, {1, 3, 2}, {2, 4, 4}, {3, 4, 1}, {4, 5, 2}};
//        int[][] arr = {{2, 1, 3}, {3, 1, 2}, {4, 2, 4}, {4, 3, 1}, {5, 4, 2}};
//        System.out.println(longestDAF(5, 5, arr));
//    }
//
//    static int longestDAF(int n, int m, int[][] edges) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < m; i++) {
//            int[] curArr = edges[i];
//            map.put(curArr[0] * 100 + curArr[1], curArr[2]);
//        }
//
//        int[][] dp = new int[n + 1][n + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (map.get(i * 100 + j) != null) {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][i] + map.get(i * 100 + j));
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        ezprint(dp, new int[]{0, 1, 2, 3, 4, 5}, new int[]{0, 1, 2, 3, 4, 5});
//        ezprint(map);
//        int maxn = Integer.MIN_VALUE;
//        for (int i = 0; i <= n; i++) {
//            maxn = Math.max(maxn, dp[n][i]);
//        }
//        return maxn;
//    }
//
//
//}
