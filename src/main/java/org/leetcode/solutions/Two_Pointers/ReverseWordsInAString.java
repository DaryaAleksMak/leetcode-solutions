package org.leetcode.solutions.Two_Pointers;


//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] splitedString = s.trim().split("\\s+");
        for (int i = 0; i < splitedString.length / 2; i++) {
            String temp = splitedString[i];
            splitedString[i] = splitedString[splitedString.length - 1 - i];
            splitedString[splitedString.length - 1 - i] = temp;
        }
        return String.join(" ", splitedString);
    }
}
