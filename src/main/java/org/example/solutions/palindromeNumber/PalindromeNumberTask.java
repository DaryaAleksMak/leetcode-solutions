package org.example.solutions.palindromeNumber;

public class PalindromeNumberTask {

    public boolean solution(int x) {
        if (x < 0) return false;
        var reversedStringInteger = new StringBuffer().append(x).reverse().toString();
        try {
            var reverderInteger = Integer.valueOf(reversedStringInteger);
            return reverderInteger.compareTo(x) == 0;
        } catch (Exception e){
            return false;
        }
    }
}
