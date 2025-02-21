package org.leetcode.solutions.sorting.countingSort;

import java.util.PriorityQueue;

//@formatter:off
/**
 * You are given a 0-indexed integer array nums of even length and there is also an empty array arr.
 * Alice and Bob decided to play a game where in every round Alice and Bob will do one move.
 * The rules of the game are as follows:
 * - Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
 * - Now, first Bob will append the removed element in the array arr, and then Alice does the same.
 * The game continues until nums becomes empty.
 * Return the resulting array arr.
 */

/**
 * input :          7, 4, 6, 3, 4
 * expected result: 3, 2, 4, 4, 5
 *
 *    0   1   2   3   4   5   6   7
 *  | 0 | 0 | 0 | 1 | 2 | 0 | 1 | 1 |
 *
 * sum previous element to current
 *    0   1   2   3   4   5   6   7
 *  | 0 | 0 | 0 | 1 | 3 | 3 | 4 | 5 |
 *
 *
 *
 *    0   1   2   3   4   5   6   7
 *  | 0 | 0 | 0 | 1 | 3 | 3 | 4 | 5 |
 *
 *  result array:
 *    0  1  2  3  4               0   1   2   3   4   5   6   7
 *  |  |  |  |  | 7 |           | 0 | 0 | 0 | 1 | 3 | 3 | 4 | 5--(4) |
 *
 *    0  1  2  3  4                0   1   2   3   4     5   6   7
 *  |  |  | 4 |  | 7 |           | 0 | 0 | 0 | 1 | 3-- | 3 | 4 | 5-- |
 *
 *    0  1  2  3  4                0   1   2   3   4      5   6   7
 *  |  |  | 4 | 6 | 7 |           | 0 | 0 | 0 | 1 | 3-- | 3 | 4-- | 5-- |
 *
 *    0  1  2   3   4               0   1   2     3     4    5   6     7
 *  | 3 |  | 4 | 6 | 7 |           | 0 | 0 | 0 | 1-- | 3-- | 3 | 4-- | 5-- |
 *
 *    0   1   2   3   4               0   1   2     3     4    5   6     7
 *  | 3 | 4 | 4 | 6 | 7 |           | 0 | 0 | 0 | 1-- | 3-- | 3 | 4-- | 5-- |
 *
 *
 */

//@formatter:on

public class MinimumNumberGame {

  // solution with sort counting
  public int[] numberGame(int[] nums) {
    int[] intsRange = new int[101];

    for (int i = 0; i < nums.length; i++) {
      intsRange[nums[i]] = intsRange[nums[i]] + 1;
    }

    for (int i = 1; i < intsRange.length; i++) {
      intsRange[i] = intsRange[i - 1] + intsRange[i];
    }

    int[] arr = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int index = intsRange[nums[i]] - 1;
      arr[index] = nums[i];
      intsRange[nums[i]] -= 1;
    }

    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = temp;
      i++;
    }

    return arr;
  }

  public int[] numberGameBruteForce(int[] nums) {

    int[] arr = new int[nums.length];

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    for (int i = 0; i < nums.length; i++) {
      priorityQueue.add(nums[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      int aliceGrap = priorityQueue.poll();
      int bobGrap = priorityQueue.poll();

      arr[i] = bobGrap;
      arr[++i] = aliceGrap;
    }

    return arr;
  }

}
