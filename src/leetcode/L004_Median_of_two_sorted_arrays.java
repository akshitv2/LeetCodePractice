package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L004_Median_of_two_sorted_arrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        double median = -0.5+((double)n+m)/2;
        double ax = 0, bx =0;
        int i =0, j =0, index = 0;

        while(i<n && j<m){
            if(Math.floor(median) == index){
                ax = Math.min(nums1[i],nums2[j]);
            }
            if(Math.ceil(median) == index){
                bx = Math.min(nums1[i],nums2[j]);
            }
            index ++;
            if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        while(i<n){
            if(Math.floor(median) == index){
                ax = nums1[i];
            }
            if(Math.ceil(median) == index){
                bx = nums1[i];
            }
            index++; i++;
        }

        while(j<m){
            if(Math.floor(median) == index){
                ax = nums2[j];
            }
            if(Math.ceil(median) == index){
                bx = nums2[j];
            }
            index++; j++;
        }

        System.out.println(ax + " " + bx);
        return (ax+bx)/2;
    }

}
