package org.example.solutions.longestCommonPrefix;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public String solution(String[] strs) {
        var minLength = Integer.MAX_VALUE;
        String firstTemplate = null;
        for (String str : strs) {
            if (str.length() <= minLength) {
                minLength = str.length();
                firstTemplate = str;
            }
        }
        var tempStorage = new ArrayList<Character>();
        for (int i = 0; i < firstTemplate.length(); i++) {
            tempStorage.add(firstTemplate.charAt(i));
        }

        for (int i = 1; i < strs.length; i++) {
            if (tempStorage.isEmpty()) {
                return "";
            }
            var current = strs[i];
            for (int j = 0; j < current.length(); j++) {
                char currentChar = current.charAt(j);
                var savedChar = tempStorage.get(j);
                if (savedChar == null) {
                    tempStorage.add(currentChar);
                } else {
                    if (currentChar != savedChar) {
                        tempStorage.subList(j, tempStorage.size()).clear();
                        break;
                    }
                }
            }
        }

        var result = new StringBuilder();
        for (Character savedChar : tempStorage) {
            if (savedChar != null) {
                result.append(savedChar);
            } else {
                break;
            }
        }
        return result.toString();
    }
}
