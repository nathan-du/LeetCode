public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) return 0;
        int outPut = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                int temp = prices[j] - prices[i];
                if(temp > 0 && temp > outPut) outPut = temp;   
            }
        }
        return outPut;
    }
}