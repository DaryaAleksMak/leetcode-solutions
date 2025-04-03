package org.leetcode.solutions.Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

  // input_array = [-4,-3,-2,-7, 8, 2, 3, -1]
  //     indexes = [0, 1 , 2, 3, 4, 5, 6, 7]
  // loop:
  // 4: -> num[4 - 1] : nums[index] = -nums[index];
  // 3: -> num[3 - 1] : nums[index] = -nums[index];
  // -2: -> num[2 - 1] : skip
  // -7: -> num[7 - 1] : skip
  // 8: -> num[8 - 1] : nums[index] = -nums[index];
  // 2: -> num[2 - 1] : nums[index] = -nums[index];
  // 3: -> num[3 - 1] : skip
  // -1: -> num[1 - 1] : nums[index] = -nums[index];
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();

    // Помечаем числа, делая их индексы отрицательными
    for (int num : nums) {
      int index = Math.abs(num) - 1;
      if (nums[index] > 0) {
        nums[index] = -nums[index];
      }
    }

    // Все индексы, которые остались положительными, соответствуют отсутствующим числам
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i + 1);
      }
    }

    return result;
  }

  public List<Integer> findDisappearedNumbersBruteForce(int[] nums) {
    var list = new ArrayList<Integer>();
    for (int num : nums){
      list.add(num);
    }

    var result = new ArrayList<Integer>();
    var reference = 1;
    while (reference <= nums.length){
      if (!list.contains(reference)){
        result.add(reference);
      }
      reference++;
    }
    return result;
  }
}
