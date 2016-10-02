public class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        long num = 9;
        while(n > digit * num) {
            n -= digit * num;
            digit++;
            num *= 10;
        }
        int number = n % digit;
        n = n/digit;
        int digit1 = digit - 1;
        int temp = 1;
        while(digit1 > 0) {
            temp *= 10;
            digit1--;
        }
        if(number == 0) return Integer.toString(temp + n - 1).charAt(digit - 1) - '0';
        return Integer.toString(temp + n).charAt(number - 1) - '0'; 
    }
}