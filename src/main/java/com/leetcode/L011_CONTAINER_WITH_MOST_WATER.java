package com.leetcode;

public class L011_CONTAINER_WITH_MOST_WATER {

    static void main() {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    //unoptimized
    public static int maxAreaUnoptim(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(Math.min(height[j], height[i]) * (j - i), max);
            }
        }
        return max;
    }

    /**
     * Calculates the maximum volume of water a container can store, represented by
     * an array of heights where the width is the distance between the indices.
     * * <p><strong>Logic:</strong></p>
     * This method uses a greedy two-pointer strategy starting from the outermost boundaries.
     * Since the area is limited by the shorter of the two lines, it attempts to find
     * a larger area by moving the pointer pointing to the shorter line inward.
     * * <p><strong>Optimizations:</strong></p>
     * <ul>
     * <li><b>Skipping Redundant Calculations:</b> Instead of recalculating the area at
     * every step, the inner {@code while} loops skip any lines that are shorter
     * than or equal to the previously encountered heights.</li>
     * <li><b>Bottleneck Principle:</b> Moving the taller pointer can never increase the
     * area because the width decreases and the height is still constrained by
     * the shorter pointer. Therefore, it only moves the pointer at the current bottleneck.</li>
     * </ul>
     * * @param height An array of integers where {@code height[i]} represents the height
     * of a vertical line at coordinate (i, height[i]).
     * @return The maximum area of water the container can store.
     * @Complexity Time: O(n), Space: O(1)
     */
    public static int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int left = height[start];
            int right = height[end];

            // Calculate the current area and update max
            int currentArea = Math.min(left, right) * (end - start);
            if (currentArea > max) max = currentArea;

            // Move pointers: always skip lines shorter than the current boundaries
            if (left < right) {
                while (start < end && height[start] <= left) {
                    start++;
                }
            } else {
                while (start < end && height[end] <= right) {
                    end--;
                }
            }
        }
        return max;
    }
}
