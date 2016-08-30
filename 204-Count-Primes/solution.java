public class Solution {
    public int countPrimes(int n) {
        if(n < 3) return 0;
        int result = 1;
        for(int i = 2; i < n; i++) {
            int j = 2;
            double judge = Math.sqrt(i) + 1;
            for(; j < judge; j++) {
                if(i % j == 0) break;
            }
            if(j >= judge) {
                    result++;
            }
        }
        return result;
    }
}