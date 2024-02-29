package org.example.solutions.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        var min = Integer.MAX_VALUE;
        var profit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > profit) {
                profit = price - min;
            }
        }
        return profit;
    }
}
