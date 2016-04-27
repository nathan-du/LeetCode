public class Solution {
    public int reverse(int x) {
        String temp = String.valueOf(x);
        int returnContent = 0;
        int judge = 0;
        if(x >= 0) judge = temp.length() - 1;
        else judge = temp.length() - 2;
        for(int i = judge; i >= 0; i--)
        {
            int tempUnit= x/(int)Math.pow(10, i);
            x -= tempUnit * Math.pow(10, i);
            returnContent += tempUnit * Math.pow(10, judge - i);
        }
        if(returnContent == Integer.MAX_VALUE || returnContent == Integer.MIN_VALUE) return 0;
        return returnContent;
        
    }
}