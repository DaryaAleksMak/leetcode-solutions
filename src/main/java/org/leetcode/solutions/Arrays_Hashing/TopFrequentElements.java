package org.leetcode.solutions.Arrays_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopFrequentElements {

  public int[] topKFrequentBrute(int[] nums, int k) {
    if (nums.length == k) {
      return nums;
    }

    var mapCounting = new HashMap<Integer, Integer>();
    for (Integer num : nums) {
      mapCounting.put(num, mapCounting.getOrDefault(num, 0) + 1);
    }

    var pq = new PriorityQueue<Map.Entry<Integer, Integer>>((a, b) -> b.getValue() - a.getValue());
    for (Map.Entry<Integer, Integer> element : mapCounting.entrySet()) {
      pq.add(element);
    }
    var result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = pq.poll().getKey();
    }

    return result;
  }
}
