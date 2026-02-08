package leetcode.del;

public class L011_Container_with_most_water {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

    }
    public static int maxAreaa(int[] height) {
        int maxArea = 0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                maxArea = Math.max(maxArea, (j-i)*Math.min(height[j], height[i]));
            }
        }
        return maxArea;
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i =0, j = height.length-1;
        while(i<j){
            maxArea = Math.max((j-i)*Math.min(height[i], height[j]),maxArea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }

}
