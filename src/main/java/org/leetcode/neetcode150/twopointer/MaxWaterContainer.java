package org.leetcode.neetcode150.twopointer;

public class MaxWaterContainer {

    public int solution(int[] heights) {
        int maxCapacity = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int currentCapacity = Math.min(heights[i], heights[j]) * (j - i);
            maxCapacity = Math.max(maxCapacity, currentCapacity);

            if (heights[i] >= heights[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxCapacity;
    }
}
