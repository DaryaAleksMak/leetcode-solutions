package org.leetcode.solutions.sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

//@formatter:off
/**
 * input:
 * 10,6,9,1
 * 7,5,11,2
 * 4,8,3,15
 * Output:
 * 7,5,11,2
 * 10,6,9,1
 * 4,8,3,15
 */
//@formatter:on

public class SortTheStudentsByTheirKthScore {

  public int[][] sortTheStudents(int[][] score, int k) {
    Arrays.sort(score, (a,b) -> b[k] - a[k]);

    return score;
  }


  public int[][] sortTheStudentsV2(int[][] score, int k) {
    Arrays.sort(score, (a, b) -> b[k] - a[k]);
    TreeMap<Integer, Integer> examToStudentMap = new TreeMap<>(Comparator.reverseOrder());

    for (int i = 0; i < score.length; i++) {
      examToStudentMap.put(score[i][k], i);
    }

    var result = new int[score.length][score[0].length];

    int newIndexStudent = 0;
    for (Integer student : examToStudentMap.values()) {
      result[newIndexStudent++] = score[student];
    }

    return result;
  }
}
