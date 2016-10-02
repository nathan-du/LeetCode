public class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        long num = 9;
        int start = 1;
        while(n > digit * num) {
            n -= digit++ * num;
            start *= 10;
            num *= 10;
        }
        start += --n/digit;
        return Integer.toString(start).charAt(n % digit) - '0';
    }
}