package com.leetcode;

public class L027_REMOVE_ELEMENT {

    static void main() {

    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                continue;
            }
            nums[k++] = nums[i];
        }
        return k;
    }


}
