class Solution {
    public int maxProfit(int[] prices) {
        int dif = 0;
        int maxB = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    dif = prices[j] - prices[i];
                    if (dif > maxB) {maxB = dif;}
                }
                
            }
        }
        return maxB;
    }
}
