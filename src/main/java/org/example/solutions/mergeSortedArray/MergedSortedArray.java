package org.example.solutions.mergeSortedArray;

public class MergedSortedArray {
//1, 2, 3, 0, 0, 0
//2, 5,
//    Output: [1,2,2,3,5,6]
    public int[] solution(int[] nums1, int m, int[] nums2, int n) {
        var i = m - 1;
        var j = n - 1;
        var k = nums1.length - 1;

        while (j >= 0) {
            if (i >= 0 && (nums1[i] > nums2[j])) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        return nums1;
    }
}
