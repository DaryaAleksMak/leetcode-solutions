package org.leetcode.algorithms.sorting;

/**
 * https://www.geeksforgeeks.org/counting-sort/ It is particularly efficient when the range of input
 * values is small compared to the number of elements to be sorted.
 */
public class CountingSort {

  public static int[] countingSort(int[] arr) {
    // Step 1: Find the maximum and minimum values in the array
    int max = 50;
    // where 50 is biggest num of possible, this could be indicated in task description
    // or if we don't know this we can get the max value from input array
    // but it will increase complexity
    int[] countArray = new int[max + 1];

    // Step 2: Create a count array and store the frequency of each element
    for (int i = 0; i < arr.length; i++) {
      countArray[arr[i]]++;
    }

    // Step 3: Modify the count array by adding the count of the previous index to the current index.
    // This step helps in placing elements directly into their correct positions in the output array.
    for (int i = 1; i < countArray.length; i++) {
      countArray[i] = countArray[i - 1] + countArray[i];
    }

    // Step 4: Traverse the input array in reverse order,
    // placing each element into its correct position in the output array based on the count array.

    var sortedNums = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      int index = countArray[arr[i]] - 1;
      sortedNums[index] = arr[i];
      countArray[arr[i]]--;
    }

    return sortedNums;

  }
}
