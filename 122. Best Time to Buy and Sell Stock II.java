class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        while (i < prices.length - 1) {
            if (prices[i+1] > prices[i]) {
                profit = profit + prices[i + 1] - prices[i];
            }
            i++;
        }
    return profit;
    }
}
