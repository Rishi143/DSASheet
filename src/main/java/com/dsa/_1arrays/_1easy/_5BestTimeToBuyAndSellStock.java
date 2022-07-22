package com.dsa._1arrays._1easy;

public class _5BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int len = prices.length;
        for(int i = 1;i < len;i++) {
            if(prices[i] > prices[i-1]) {
                totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }

}
