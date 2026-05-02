class Solution {
    public int maxProfit(int[] prices) {
        /*
        1.Naive Solution: 2 Loops
        Optimal: 2 Pointers 
        
        2. If max_profit<0, return 0
        */
        
        int l = 0; int max_profit = 0; int r = 1; int len = prices.length;
        while (r < len) {
            if (prices[r] > prices[l]) max_profit = Math.max(max_profit, prices[r] - prices[l]);
            else {
                l=r;
            }
            r++;
        }
        return max_profit;

        // int max_profit = 0;
        // for (int i = 0; i<prices.length; i++) {
        //     for (int j = i+1; j<prices.length; j++) {
        //         int profit = prices[j] - prices[i];
        //         if (profit > max_profit) max_profit = profit;
        //     }
        // }
        // return max_profit;
    }
}
