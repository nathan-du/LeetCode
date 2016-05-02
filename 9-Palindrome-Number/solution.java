public class Solution {
    public boolean isPalindrome(int x) {
       if(x == 0) return true;
        String temp = String.valueOf(x);
        if(x < 0)
        {
            return false;
        }
        else if(x > 0)
        {
            for(int i = 0; i <= temp.length()/2 - 1; i++)
            {
                if(!(temp.charAt(i) == temp.charAt(temp.length()-i-1))) return false;
            }
            return true;
        }
        return false;
    }
}