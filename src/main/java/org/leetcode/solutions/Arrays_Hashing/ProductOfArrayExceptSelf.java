package org.leetcode.solutions.Arrays_Hashing;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixMultiple = new int[nums.length];
        prefixMultiple[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixMultiple[i] = nums[i] * prefixMultiple[i - 1];
        }

        int[] suffixMultiple = new int[nums.length];
        suffixMultiple[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            suffixMultiple[i] = nums[i] * suffixMultiple[i + 1];
        }

        int[] result = new int[nums.length];
        result[0] = suffixMultiple[1];
        result[nums.length - 1] = prefixMultiple[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++){
            result[i] = prefixMultiple[i - 1] * suffixMultiple[i + 1];
        }
        return result;
    }

    public int[] productExceptSelf1(int[] nums) {
        var result = new int[nums.length];
        var product = 1;

        var countOfZeroValue = 0;
        Integer indexZeroValue = null;

        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (num == 0) {
                ++countOfZeroValue;
                indexZeroValue = i;
                if (countOfZeroValue > 1) return result;
                continue;
            }

            product *= num;
        }

        if (countOfZeroValue > 0) {
            result[indexZeroValue] = product;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }
}
