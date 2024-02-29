package org.example.solutions.Arrays_Hashing;

import java.util.Arrays;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public int longestConsecutiveBruteSolution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        TreeSet<Integer> countsOfSequence = new TreeSet<>();
        Integer[] sortedArray = new TreeSet<>(Arrays.stream(nums).boxed().toList()).toArray(new Integer[0]);

        if (sortedArray.length == 1) {
            return 1;
        }
        var startIndex = 0;
        var lastIndex = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            if (i + 1 < sortedArray.length && sortedArray[i + 1] - sortedArray[i] == 1) {
                lastIndex = i + 1;
                countsOfSequence.add(lastIndex - startIndex + 1);
            } else {
                countsOfSequence.add(lastIndex - startIndex + 1);
                startIndex = i + 1;
            }
        }

        return countsOfSequence.isEmpty() ? 0 : countsOfSequence.last();
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        TreeSet<Integer> countsOfSequence = new TreeSet<>();
        for (int i = 1; i < nums.length; i++) {
            var length = 1;
            while (i < nums.length && nums[i] - nums[i - 1] <= 1) {
                if (nums[i] - nums[i - 1] == 0) {
                    ++i;
                    continue;
                }
                ++i;
                ++length;
            }
            countsOfSequence.add(length);
        }
        return countsOfSequence.last();
    }
}
