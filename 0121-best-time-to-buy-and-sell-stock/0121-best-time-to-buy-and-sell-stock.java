class Solution {
    public int maxProfit(int[] prices) {

        int Maxprofit = 0;
        int minp = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minp = Math.min(minp, prices[i]);
            int profit = prices[i] - minp;
            Maxprofit = Math.max(Maxprofit, profit);
        }

        return Maxprofit;
    }

}
