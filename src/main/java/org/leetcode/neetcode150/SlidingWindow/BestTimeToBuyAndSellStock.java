package org.leetcode.neetcode150.SlidingWindow;

public class BestTimeToBuyAndSellStock {

  //2,11,1,4,7
  // profit = 0
  // min = 2
  // i = 1: min = Math.min(2,11) = 2 profit = Math.max(11 - min, profit) = 9
  // i = 2: min = Math.min(2,1) = 1 profit = Math.max(abs(1 - min), profit) = 9
  // i = 4: min = Math.min(4,1) = 1 profit = Math.max(abs(4 - min), profit) = 9
  // i = 7: min = Math.min(7,1) = 1 profit = Math.max(abs(7 - min), profit) = 9
  public int maxProfit(int[] prices) {

    var min = prices[0];
    var profit = 0;

    for (int i = 1; i < prices.length; i++) {
      min = Math.min(prices[i], min);
      profit = Math.max(prices[i] - min, profit);
    }

    return profit;

  }
}
