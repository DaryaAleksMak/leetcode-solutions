package org.example.solutions.Arrays_Hashing;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
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
