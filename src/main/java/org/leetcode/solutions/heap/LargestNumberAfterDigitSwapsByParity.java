package org.leetcode.solutions.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumberAfterDigitSwapsByParity {

  public int largestInteger(int num) {
    if (num < 10) {
      return num;
    }
    char[] charArray = String.valueOf(num).toCharArray();

    PriorityQueue<Integer> oddValuesHeap = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> evenValuesHeap = new PriorityQueue<>(Comparator.reverseOrder());

    int[] parity = new int[charArray.length];

    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] % 2 == 0) {
        parity[i] = 0;
        evenValuesHeap.add(Character.getNumericValue(charArray[i]));
      } else {
        parity[i] = 1;
        oddValuesHeap.add(Character.getNumericValue(charArray[i]));
      }
    }

    for (int i = 0; i < charArray.length; i++) {
      if (parity[i] == 0) {
        charArray[i] = Character.forDigit(evenValuesHeap.poll(), 10);
      }
      if (parity[i] == 1) {
        charArray[i] = Character.forDigit(oddValuesHeap.poll(), 10);
      }
    }

    return Integer.parseInt(String.valueOf(charArray));
}

}
