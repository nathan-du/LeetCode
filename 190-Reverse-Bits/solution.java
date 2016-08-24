public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n == 0) return 0;
        int bit = 0;
        int result = 0;
        for(int i = 0; i < 32; i++) {
            bit = n & (1 << i);
            if(bit != 0) {
                result += 1 << (31 - i);
            }
        }
        return result;
    }
}