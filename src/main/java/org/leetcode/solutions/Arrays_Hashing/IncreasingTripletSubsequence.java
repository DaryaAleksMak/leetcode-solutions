package org.leetcode.solutions.Arrays_Hashing;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        var first = Integer.MAX_VALUE;
        var second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
                continue;
            }
            if (num <= second) {
                second = num;
                continue;
            }

            if (num > first && num > second) {
                return true;
            }
        }
        return false;
    }
}
