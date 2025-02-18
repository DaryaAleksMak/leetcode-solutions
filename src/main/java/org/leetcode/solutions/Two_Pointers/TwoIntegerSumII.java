package org.leetcode.solutions.Two_Pointers;

public class TwoIntegerSumII {
    public int[] solution(int[] numbers, int target) {
        int firstIndex = 0;
        int secondIndex = numbers.length - 1;
        while (firstIndex != secondIndex){
            if (numbers[firstIndex] + numbers[secondIndex] == target) {
                return new int[]{++firstIndex, ++secondIndex};
            }

            if (numbers[firstIndex] + numbers[secondIndex] > target) {
                --secondIndex;
                continue;
            }

            if (numbers[firstIndex] + numbers[secondIndex] < target) {
                ++firstIndex;
            }
        }
        return new int[]{};
    }
}
