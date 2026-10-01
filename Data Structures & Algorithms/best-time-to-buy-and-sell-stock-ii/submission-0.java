class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int c = 0;
        for (int i = 0;i<n-1;i++){
            int max = 0;
            if (prices[i+1]>prices[i]){
                max = Math.max(max,prices[i+1]-prices[i]);
            }
            c += max;
        }
        return c;
    }
} 