public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 2) return false;
        return num > 0 && 1073741824 % num == 0 && (num & 0xAAAAAAAA) == 0;
    }
}