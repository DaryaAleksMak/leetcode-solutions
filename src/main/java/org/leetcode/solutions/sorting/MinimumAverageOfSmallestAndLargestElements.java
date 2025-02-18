package org.leetcode.solutions.sorting;

import java.util.ArrayList;

public class MinimumAverageOfSmallestAndLargestElements {

  public double minimumAverage(int[] nums) {
    int[] intsRange = new int[51];

    for (int i = 0; i < nums.length; i++) {
      intsRange[nums[i]]++;
    }

    for (int i = 1; i < intsRange.length; i++) {
      intsRange[i] = intsRange[i - 1] + intsRange[i];
    }

    var sortedNums = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int index = intsRange[nums[i]] - 1;
      sortedNums[index] = nums[i];
      intsRange[nums[i]]--;
    }

    ArrayList<Double> averages = new ArrayList<>();

    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      double min = sortedNums[left++];
      double max = sortedNums[right--];
      averages.add((max + min) / 2);
    }

    double min = Double.MAX_VALUE;
    for (Double average : averages) {
      if (average < min) {
        min = average;
      }

    }
    return min;
  }
}
