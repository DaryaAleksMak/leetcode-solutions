package org.leetcode.solutions.Arrays_Hashing;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

  //@formatter:off
  /**
   * a ⊕ a = 0 (если два одинаковых числа XOR-ить, получится 0). a ⊕ 0 = a (XOR с нулем не меняет
   * число). a ⊕ b ⊕ b = a (если число встречается дважды, оно "уходит", оставляя только то, что не
   * повторяется).
   * <p>
   * input array:  2,3,1,6,7 array index:  0,1,2,3,4
   * <p>
   * result triplets: (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
   * <p>
   * 0 = 0 0^2 = 2 0^2^3 = 1 0^2^3^1 = 0 0^2^3^1^6 = 6 0^2^3^1^6^7 = 1
   * <p>
   * indexes : values : XOR (2,3,4) : 1,6,7  : 0^1 = 6^7 == 1==1 (2,3,4) : 1,6,7  : 1^6 = 7 == 1==1
   *
   *
   * 2^3 = 1
   * 2^3^1 = 0  (0,1,2), (0,2,2)
   * 2^3^1^6=6
   * 2^3^1^6^7=1
   *
   * 3^1 = 2
   * 3^1^6=4
   * 3^1^6^7=3
   *
   * 1^6=7
   * 1^6^7=0 (2,3,4) ()
   *
   */
  //@formatter:on
  public int countTriplets(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int xor = arr[i];
      for (int k = i + 1; k < arr.length; k++) {
        xor = xor ^ arr[k];
        if (xor == 0) {
          result += k - i;
        }
      }
    }
    return result;
  }
}
