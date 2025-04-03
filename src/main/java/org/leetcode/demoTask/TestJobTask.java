package org.leetcode.demoTask;

public class TestJobTask {

  //@formatter:off
  /**
   * ABBABAAB l = left index of substring r = right index of substring k = index of seeking
   * character
   * <p>
   * l = 1 r = 4 k = 4
   * <p>
   * [1,4] = [ABBA] 4=th = 'A' is 2rd occurrence 2rd occurrence of B in 3rd index
   * <p>
   * l = 2 r = 6 k = 1
   * <p>
   * [2,6] = [BBABA] subArray[1] = B first occurrence A first occurrence index = 3
   * <p>
   * l = 3 r = 7 k = 5
   * <p>
   * [3,7] = [BABAA] subArray[5] = A third occurrence A third occurrence of B index = -1
   *
   * @return
   */
  //@formatter:on
  public int solution(int length, int numberOfQueries, String inputString, int[][] queries) {
    var query = queries[0];

    //for support 1-indexes based array
    var leftIndex = query[0] - 1;
    var rightIndex = query[1] - 1;
    var kIndex = query[2] - 1;

    var substring = inputString.substring(leftIndex, rightIndex + 1);
    var substringCharArray = substring.toCharArray();
    var k_thChar = substringCharArray[kIndex];

    int countSelectedChar = 0;
    for (int i = 0; i <= kIndex; i++) {
      if (substringCharArray[i] == k_thChar) {
        countSelectedChar++;
      }
    }

    int resultIndex = -1;
    for (int i = 0; i < substringCharArray.length; i++) {
      if (substringCharArray[i] != k_thChar) {
        countSelectedChar--;
      }
      if (countSelectedChar == 0) {
        resultIndex = i;
      }
    }
    return resultIndex;

  }

}
