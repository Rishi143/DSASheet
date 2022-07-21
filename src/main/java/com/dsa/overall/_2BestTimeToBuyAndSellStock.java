package com.dsa.overall;

public class _2BestTimeToBuyAndSellStock {

    /*
    * Declare maxProfit as 0
    * First we need to declare minimum until current index as first element
    * Traverse each element and find current profit at each element from
    * difference of current element from minuntilnow
    * if the difference is greater than maxprofit then update it
    * end of loop if current element is min than minuntilnow
    * update minuntilnow to current element
    * */

    public int maxProfit(int[] prices) {
        int maxProfit = 0,len = prices.length;
        if(prices == null || len == 0) {
            return 0;
        }
        int minUntilNow = prices[0];
        for(int i = 0;i < len;i++) {
            int currProfit = prices[i] - minUntilNow;
            maxProfit = Math.max(maxProfit,currProfit);
            minUntilNow = Math.min(prices[i],minUntilNow);
        }
        return maxProfit;
    }

}
