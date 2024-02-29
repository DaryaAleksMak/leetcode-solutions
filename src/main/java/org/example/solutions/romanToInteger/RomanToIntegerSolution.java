package org.example.solutions.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    static Map<Character, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }


    public int solution(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            var current = romanToIntegerMap.get(s.charAt(i));
            var next = i + 1 < s.length() ? romanToIntegerMap.get(s.charAt(i + 1)) : 0;
            if (current >= next) {
                sum += current;
            } else {
                sum = sum + (next - current);
                i++;
            }
        }
        return sum;
    }
}
