package org.example.solutions.Two_Pointers;

import java.util.ArrayList;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return true;
        }

        char[] charArray = s.toCharArray();
        var cleanArray = new ArrayList<Character>();
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isAlphabetic(charArray[i]) || Character.isDigit(charArray[i])) {
                cleanArray.add(index++, Character.toLowerCase(charArray[i]));
            }
        }

        if (cleanArray.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = cleanArray.size() - 1;
        while (start < end){
            if (!cleanArray.get(start++).equals(cleanArray.get(end--))) {
                return false;
            }

        }
        return true;
    }

}
