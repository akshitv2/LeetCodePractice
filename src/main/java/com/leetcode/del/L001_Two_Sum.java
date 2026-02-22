package com.leetcode.del;

import java.util.HashMap;

public class L001_Two_Sum {
    public static void main(String[] args) {
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i]) != null){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }

}
