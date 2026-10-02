class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){
            minPrices = Math.min(minPrices,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrices);
        }
        return maxProfit;
    }
}