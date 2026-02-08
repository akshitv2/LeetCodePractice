package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L001_Two_Sum {

    static void main() {
        int[] nums = {2,7,11,15};int target = 9;
//        int[] nums = {3,3};int target = 6;

        for(int i:twoSum(nums, target)){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(hmap.get(diff)!=null){
                return new int[]{i, hmap.get(diff)};
            }
            hmap.put(nums[i], i);
        }
        return null;
    }
}
