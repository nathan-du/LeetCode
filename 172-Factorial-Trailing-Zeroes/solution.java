public class Solution {
    public int trailingZeroes(int n) {
        int judge = 5, result = 0; 
        while(n > 0) {
            result += n/judge;
            n /= judge;
        }
        return result;
        
    }
}