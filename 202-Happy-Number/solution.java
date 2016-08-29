public class Solution {
    public boolean isHappy(int n) {
        int result = 0;
        int temp = 0;
        while(n > 0) {
                temp += Math.pow(n % 10, 2);
                n /= 10;
        }
        if(temp == 1) return true;
        while(result != temp) {
            result = 0;
            while(n > 0) {
                result += Math.pow(n % 10, 2);
                n /= 10;
            }
            if(result == 1) return true;
        }
        return false;
    }
}