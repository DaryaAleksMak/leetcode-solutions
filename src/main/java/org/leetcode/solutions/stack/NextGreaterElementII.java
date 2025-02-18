package org.leetcode.solutions.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {

        int[] mergedArray = new int[nums.length * 2];
        System.arraycopy(nums, 0, mergedArray, 0, nums.length);
        System.arraycopy(nums, 0, mergedArray, nums.length, nums.length);

        int[] result = new int[nums.length * 2];

        var stack = new Stack<Integer>();
        for (int i = mergedArray.length - 1; i >= 0; i--) {
            var element = mergedArray[i];
            if (stack.isEmpty()) {
                stack.push(element);
                result[i] = -1;
                continue;
            }

            if (element < stack.peek()) {
                result[i] = stack.peek();
                stack.push(element);
                continue;
            }

            while (true) {
                if (stack.isEmpty()) {
                    stack.push(element);
                    result[i] = -1;
                    break;
                }

                if (element >= stack.peek()) {
                    stack.pop();
                } else {
                    result[i] = stack.peek();
                    stack.push(element);
                    break;
                }
            }
        }

        return Arrays.copyOfRange(result, 0, nums.length);
    }
}
