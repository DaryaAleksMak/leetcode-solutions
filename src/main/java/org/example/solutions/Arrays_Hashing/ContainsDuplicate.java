package org.example.solutions.Arrays_Hashing;

import java.util.*;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        var hashSet = new HashSet<Integer>();
        for (int element : nums) {
            if (!hashSet.add(element)) {
                return true;
            }
        }
        return false;
    }

    // brute force
    public boolean containsDuplicateBruteForce1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.stream(nums).boxed().toList());
        return hashSet.size() < nums.length;
    }

    // O(nLog(n))
    public boolean containsDuplicateBruteForce2(int[] nums) {
        Arrays.sort(nums);
        Integer prevElem = null;
        for (int element : nums) {
            if (prevElem != null && element == prevElem) {
                return true;
            } else {
                prevElem = element;
            }
        }
        return false;
    }

    // O(n 2) - в квадраті
    public boolean containsDuplicateTimeLimitExceeded(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
