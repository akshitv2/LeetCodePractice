package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;

import static com.leetcode.COMMON.print;

public class L016_3Sum_Closest {

    static void main() throws JsonProcessingException {
        print(threeSumClosest(new int[]{-1, 0, 1, 2, -1, -4, 2},0));
        print(threeSumClosest(new int[]{-1,2,1,-4},1));
        print(threeSumClosest(new int[]{1,1,1,0},100));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int start =0 ,end = nums.length-1;
        int smallest = Integer.MAX_VALUE;
        Arrays.sort(nums);

        while(start<end){
            for(int i=start+1;i<end;i++){
                System.out.println(nums[start] + "+" + nums[end] + "+" +  nums[i] + " = " +  (nums[start] + nums[end] + nums[i]));
                int diff = (nums[start] + nums[end] + nums[i]) - target;
                if(Math.abs(diff) < Math.abs(smallest)){
                    smallest = diff;
                }
            }

            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                start++;
            }else if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                end --;
            }else{
                start++;
                //todo add logic to compare next ones and move the smaller jump
            }
        }
        return smallest + target;
    }
}
