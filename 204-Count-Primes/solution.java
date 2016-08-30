public class Solution {
    public int countPrimes(int n) {
        if(n < 3) return 0;
        int count = 0;
        boolean [] noPrime = new boolean[n];
        for(int i = 2; i < n; i++) {
            if(!noPrime[i]) {
                count++;
                for(int j = 2; i * j < n; j++) {
                    noPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}