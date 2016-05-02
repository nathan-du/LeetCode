public class Solution {
    public boolean isPalindrome(int x) {
       if(x == 0) return true;
       else if(x < 0) return false;
       else return reverse(x) == x;
    }
    int reverse(int x)
    {
        int num = 0;
        while(x != 0)
        {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }
}