class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        int pnow = 0;
        for(int i = 0; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            pnow = prices[i] - min;
            if(res < pnow){
                res = pnow;
            }
        }
        
        return res;
    }
}
