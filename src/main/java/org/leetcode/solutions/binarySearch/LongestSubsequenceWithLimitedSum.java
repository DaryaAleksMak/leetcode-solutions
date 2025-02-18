package org.leetcode.solutions.binarySearch;

import java.util.Arrays;
//@formatter:off
/**
 * nums = [4, 5, 2, 1] queries = [3, 10, 21] answer = []
 * <p>
 * <p>
 * 1. sort nums [1,2,4,5]
 * 2. create and fill simNums: [1,3,7,12]
 * 3. currentQuery = 3 -> we are looking element in sumMumsArray which <= currentQuery with binary search
 *
 * left = 0
 * right = 3
 * mid = (3 + 0) / 2 = 1
 *
 *
 *
 */
//@formatter:on

public class LongestSubsequenceWithLimitedSum {

  public int[] answerQueries(int[] nums, int[] queries) {
    int[] answer = new int[queries.length];
    Arrays.sort(nums);

    int[] sumNums = new int[nums.length];
    sumNums[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sumNums[i] = sumNums[i - 1] + nums[i];
    }

    for (int i = 0; i < queries.length; i++) {

      int left = 0;
      int right = sumNums.length - 1;
      int mid;
      int currentMinSize = 0;

      while (left <= right) {
        mid = (left + right) / 2;

        if (sumNums[mid] == queries[i]) {
          currentMinSize = mid + 1;
          break;
        }

        if (sumNums[mid] < queries[i]) {
          left = mid + 1;
          currentMinSize = mid + 1;
          continue;
        }

        if (sumNums[mid] > queries[i]) {
          right = mid - 1;
        }
      }

      answer[i] = currentMinSize;
    }

    return answer;

  }

}
