package org.example.solutions.majorityElement;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public int solution2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int solution(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
            if (map.get(n) > nums.length / 2) return n;
        }
        return 0;
    }
}
