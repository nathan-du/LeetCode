public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int difference = 0;
        
        for(int temp: prices)
        {
            min = Math.min(temp, min);
            difference = Math.max(difference, temp - min);
        }
        return difference;
        
    }
}