public class Solution {
    public int integerReplacement(int n) {
        if(n == Integer.MAX_VALUE) return 32;
        return getTimes(n, 0);
    }
    
    public int getTimes(int n, int times) {
        if(n == 0) return 0 + times;
        if(n == 1) return 0 + times;
        if(n == 2) return 1 + times;
        if(n % 2 == 0) return getTimes(n/2, times + 1);
        else return Math.min(getTimes(n - 1, times + 1), getTimes(n + 1, times + 1));
    }
}