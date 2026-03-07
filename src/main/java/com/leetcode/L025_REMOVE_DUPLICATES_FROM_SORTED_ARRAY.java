package com.leetcode;

public class L025_REMOVE_DUPLICATES_FROM_SORTED_ARRAY {

    static void main() {

    }
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int last = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == last){
              continue;
            }
            nums[k] = nums[i];
            k++;
            last = nums[i];
        }
        return k;
    }


}
