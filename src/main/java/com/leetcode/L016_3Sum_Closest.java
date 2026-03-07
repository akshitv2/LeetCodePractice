package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;

import static com.leetcode.COMMON.print;

public class L016_3Sum_Closest {

    static void main() throws JsonProcessingException {
//        print(threeSumClosest(new int[]{-1, 0, 1, 2, -1, -4, 2},0));
//        print(threeSumClosest(new int[]{-1,2,1,-4},1));
//        print(threeSumClosest(new int[]{1,1,1,0},100));
//        print(threeSumClosest(new int[]{1,2,0},3));
        print(threeSumClosest(new int[]{2,3,8,9,10},16));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        print(nums);
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i < nums.length-2;i++){
            int start = i+1, end = nums.length-1;
            while(start<end){
                if(end == i){
                    end--;
                    continue;
                }
                int sum = nums[i] + nums[end] + nums[start] - target;
//                System.out.println( nums[i] + " " + nums[start] + " " + nums[end] + " = " + sum);
                if(Math.abs(sum) < Math.abs(smallest)){
                    smallest = sum;
                }
                if(sum == 0){
                    return target;
                } else if (sum < 0) {
                    start++;
                } else{
                    end--;
                }
            }
        }
        return smallest + target;
    }
}
