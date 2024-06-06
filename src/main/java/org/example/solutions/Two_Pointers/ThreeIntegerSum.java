package org.example.solutions.Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeIntegerSum {

    public List<List<Integer>> solutionSlow(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return result;
        }

        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(List.of(nums[0], nums[1], nums[2]));
                return result;
            } else {
                return result;
            }
        }

        var numToIndex = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            var indexesByValue = numToIndex.getOrDefault(number, new ArrayList<>());
            indexesByValue.add(i);
            numToIndex.put(number, indexesByValue);
        }

        Arrays.sort(nums);
        var resultSet = new HashSet<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int num1 = nums[i];
                int num2 = nums[j];
                int difSub = -(num1 + num2);

                var indexes = numToIndex.get(difSub);
                if (indexes == null || indexes.isEmpty()) {
                    continue;
                }

                if (difSub == num1 && difSub == num2 && indexes.size() < 3) {
                    continue;
                }
                if ((difSub == num1 || difSub == num2) && indexes.size() < 2) {
                    continue;
                }

                var triple = new ArrayList<Integer>();
                triple.add(num1);
                triple.add(num2);
                triple.add(difSub);
                triple.sort(Integer::compareTo);
                resultSet.add(triple);
            }
        }

        result.addAll(resultSet);
        return result;
    }
}
