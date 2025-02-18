package org.leetcode.solutions;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        var appearVal = 0;
        var lastIndexNotChanged = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                appearVal++;
                if (i != lastIndexNotChanged) {
                    nums[i] = nums[lastIndexNotChanged];
                }
                nums[lastIndexNotChanged--] = Integer.MAX_VALUE;
            }
        }

        return nums.length - appearVal;
    }
}
