package org.example.solutions.Arrays_Hashing;

import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            var sum = Arrays.stream(account).sum();
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
