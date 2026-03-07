package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;

import static com.leetcode.COMMON.print;

public class L018_4Sum {

    static void main() throws JsonProcessingException {
        print(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
        print(fourSum(new int[]{2,2,2,2,2}, 8));
        print(fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0));
        print(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
//        print(threeSum(new int[]{-1, 0, 1, 2, -1, -4, 2}));
//        print(threeSum(new int[]{-1, 0, 1, 0}));
//        print(threeSum(new int[]{0, 1, 1}));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        print(nums);

        for(int j=0;j< nums.length-3;j++) {
            if(j!=0 && nums[j] == nums[j-1]) {
                continue;
            }
            for (int i = j+1; i < nums.length - 2; i++) {
//                if (nums[i] > 0) {
//                    return answer;
//                }
                if (i != j+1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int start = i+1, end = nums.length - 1;
                while (start < end) {

                    if ((long)nums[start] + nums[end] + nums[i] + nums[j] == target) {
                        answer.add(Arrays.asList(nums[j], nums[i], nums[start], nums[end]));
                        int cur = nums[start];
                        while (start < end && nums[start] == cur) {
                            start++;
                        }
                        cur = nums[end];
                        while (start < end && nums[end] == cur) {
                            end--;
                        }
                    } else if (nums[j] + nums[start] + nums[end] + nums[i] < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return answer;
    }

}
