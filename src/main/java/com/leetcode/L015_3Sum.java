package com.leetcode;

import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.leetcode.COMMON.print;

public class L015_3Sum {

    static void main() throws JsonProcessingException {
        print(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
//        print(threeSum(new int[]{-1, 0, 1, 2, -1, -4, 2}));
        print(threeSum(new int[]{1,2,0,1,0,0,0,0}));
//        print(threeSum(new int[]{-1, 0, 1, 0}));
//        print(threeSum(new int[]{0, 1, 1}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i< nums.length-2;i++){
            if(nums[i] > 0){
                return answer;
            }
            if(i != 0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i, end = nums.length-1;
            while(start<end){
                if(start == i){
                    start++;
                    continue;
                }
                if(end == i){
                    end--;
                    continue;
                }
                if(nums[start] + nums[end] + nums[i] == 0){
                    answer.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    int cur = nums[start];
                    while(start < end && nums[start] == cur) {
                        start++;
                    }
                    cur = nums[end];
                    while(start < end && nums[end] == cur) {
                        end--;
                    }
                } else if (nums[start] + nums[end] +nums[i] < 0) {
                    start++;
                } else{
                    end--;
                }
            }
        }
        return answer;
    }

    public static List<List<Integer>> threeSumx(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        Arrays.sort(nums);
        int[] arrMap = new int[nums[nums.length - 1] - nums[0] + 1];
        int[] uniques = new int[65536];
        int uniqueIndex = 0;
        for (int i : nums) {
            arrMap[i - nums[0]]++;
            if (uniqueIndex == 0 || uniques[uniqueIndex - 1] != i) {
                uniques[uniqueIndex++] = i;
            }
        }

        System.out.println();
        for (int xi = 0; xi < uniqueIndex - 1; xi++) {
            int i = uniques[xi];
            int singDiff = -2 * i;
            if (arrMap[i - nums[0]] > 1) {
                if (i == 0) {
                    if (arrMap[(i - nums[0])] > 2) {
                        answer.add(Arrays.asList(0, 0, 0));
                    }
                } else if (singDiff <= nums[nums.length - 1] && singDiff >= nums[0] && arrMap[(singDiff - nums[0])] > 0) {
                    answer.add(Arrays.asList(i, i, singDiff));
                }
            }
            for (int xj = xi + 1; xj < uniqueIndex; xj++) {
                int j = uniques[xj];
                int diff = -(i + j);
                if (diff > j && diff <= nums[nums.length - 1] && arrMap[(diff - nums[0])] > 0) {
                    answer.add(Arrays.asList(i, j, diff));
                }
            }
        }
        int i = uniques[uniqueIndex - 1];
        int singDiff = -2 * i;
        if (arrMap[(i - nums[0])] > 1) {
            if (i == 0) {
                if (arrMap[(i - nums[0])] > 2) {
                    answer.add(Arrays.asList(0, 0, 0));
                }
            } else if (singDiff <= nums[nums.length - 1] && singDiff >= nums[0] && arrMap[(singDiff - nums[0])] > 0) {
                answer.add(Arrays.asList(i, i, singDiff));
            }
        }
        return answer;
    }
}
