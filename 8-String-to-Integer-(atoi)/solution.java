public class Solution {
    public int myAtoi(String str) {
        if(str.length() == 0) return 0;
        boolean plusMinus = true;
        boolean judge = false;
        int num = 0;
        long sum = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '+' && !judge)
            {
                plusMinus = true;
                judge = true;
            }
            else if(str.charAt(i) == '-' && !judge)
            {
                plusMinus = false;
                judge = true;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                num = str.charAt(i) - '0';
                judge = true;
            }
            else if(str.charAt(i) == ' ' && !judge)
            {
                
            }
            else break;
            
            sum = sum * 10 + num;
            if(sum > Integer.MAX_VALUE) return plusMinus? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return plusMinus? (int)sum : (int)-sum;
    }
}