package org.leetcode.solutions.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a positive integer n.
 * <p>
 * A binary string x is valid if all substrings of x of length 2 contain at least one "1".
 * <p>
 * Return all valid strings with length n, in any order.
 * <p>
 * Input: n = 3 Output: ["010","011","101","110","111"]
 * <p>
 * 000 -not valid 001 - not valid 010 - valid 011 - valid 100 - not valid 101 - valid 110 - valid
 * 111 - valid
 * <p>
 * 2*2*2 = 8 when n=3
 * <p>
 * <p>
 * 0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111
 */
public class GenerateBinaryStringsWithoutAdjacentZeros {

  public List<String> validStrings(int n) {
    double pow = Math.pow(2, n);

    ArrayList<StringBuilder> stringBuildersList = new ArrayList<>();

    int delimiter = 2;
    for (int k = 0; k < n; k++) {
      int binarySwitcher = 0;
      int step = (int) (pow / delimiter);
      int currentStep = step;

      for (int i = 0; i < pow; i++) {
        StringBuilder builder;
        try {
          builder = stringBuildersList.get(i);
        } catch (IndexOutOfBoundsException exception) {
          builder = new StringBuilder();
          stringBuildersList.add(i, builder);
        }

        if (currentStep == 0) {
          binarySwitcher = binarySwitcher == 1 ? 0 : 1;
          currentStep = step;
        }
        builder.append(binarySwitcher);
        currentStep--;
      }
      delimiter = delimiter * 2;
    }

    ArrayList<String> result = new ArrayList<>();
    for (StringBuilder builder : stringBuildersList) {
      String binaryString = builder.toString();
      if (!binaryString.matches(".*0{2,}.*")) {
        result.add(binaryString);
      }
    }

    return result;

  }

}
