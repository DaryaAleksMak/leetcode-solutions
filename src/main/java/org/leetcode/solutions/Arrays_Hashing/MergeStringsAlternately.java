package org.leetcode.solutions.Arrays_Hashing;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        var word1Length = word1.length();
        var word2Length = word2.length();
        StringBuffer stringBuffer = new StringBuffer();
        var loopSize = Math.max(word1.length(), word2.length());

        for (int i = 0; i < loopSize; i++) {
            if (word1Length - 1 >= i) {
                stringBuffer.append(word1.charAt(i));
            }
            if (word2Length - 1 >= i) {
                stringBuffer.append(word2.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
