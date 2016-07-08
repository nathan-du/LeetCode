public class Solution {
    public int[] plusOne(int[] digits) {
        boolean judge = false;
        for(int i = 0; i < digits.length; i++)
        {
            if(digits[i] != 9)
            {
                judge = true;
                break;
            }
        }
        if(!judge)
        {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for(int i = 0; i < digits.length; i++)
            {
                res[i + 1] = 0;
            }
            return res;
        }
        else
        {
            digits[digits.length - 1] += 1; 
            for(int i = digits.length - 1; i >= 0; i--)
            {
                if(digits[i] == 10)
                {
                    digits[i] = 0;
                    digits[i - 1] += 1; 
                }
            }
            return digits;
        }
    }
}