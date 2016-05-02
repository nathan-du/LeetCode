public class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x < 0) return false;
        else
        {
            String temp = String.valueOf(x);
            for(int i = 0; i <= temp.length()/2 - 1; i++)
            {
                if(!(temp.charAt(i) == temp.charAt(temp.length()-i-1))) return false;
            }
            return true;
        }
    }
}