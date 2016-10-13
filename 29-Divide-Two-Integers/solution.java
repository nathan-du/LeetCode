public class Solution {
    public int divide(int dividend, int divisor) {
        boolean signA = dividend >= 0, signB = divisor >= 0;
        long num = Math.abs((long)dividend), div = Math.abs((long)divisor), curr = 0, res = 0;
        for(int i = 31; i >= 0; i--) {
            res <<= 1;
            curr <<= 1;
            curr |= (num >> i & 1);
            if(curr >= div) {
                curr -= div;
                res |= 1;
            }
        }
        if(res > Integer.MAX_VALUE && !(signA ^ signB)) return Integer.MAX_VALUE;
        if(signA ^ signB) {
            return -(int)res;
        }
        return (int)res;
    }
}