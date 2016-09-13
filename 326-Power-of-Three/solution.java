public class Solution {
    public boolean isPowerOfThree(int n) {
        double i = 0;
        while(true) {
            double judge = Math.pow(i, 3.0);
            if(judge == n) {
                return true;
            }
            if(judge > n)
            return false;
        }
    }
}