package org.leetcode.solutions.binarySearch;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

//@formatter:off
/**
 * 1,2,3,4 . . 7  m = 3
 * 1. positions.sort 2. (position[last] - position[first] ) / m = (7-1) / 3 = 2 + 1(next) - step or force
 *
 * 1 ... 1+(2+1)(4) ... 4+(2+1)(7)
 *
 * 3. we have to check that we have basket with such positions [1,4,7] -> true
 *
 * Example:
 * (1) 2 3 4 (5) 6 7 8 9 (10)
 * 1 2 3 5 . . . 10 m = 3 step = (10 - 1) / 3 = 4 (round to up)
 *
 * array[0] = 1         ->  exist
 * array[0] + step = 5  -> not exist
 *  -> we have to find nearest position where position[i] - (array[0] + step) the min BS
 *
 *  1
 *  2 : 2 - 1 = 1
 *  3: 3 - 1 = 2
 *  5: 5 - 1 = 4
 *  10: 10 - 4 = 6
 */
//@formatter:on

public class MagneticForceBetweenTwoBalls {

  public int maxDistance(int[] position, int m) {
    Arrays.sort(position);
    int first = position[0];
    int last = position[position.length - 1];

    var step = BigDecimal.valueOf(last - first)
        .divide(BigDecimal.valueOf(m), 0, RoundingMode.HALF_UP.ordinal())
        .intValue() + 1;

    for (int i = 0; i < position.length; i++) {

    }

    return 0;
  }

}
