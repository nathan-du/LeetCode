public class Solution {
    public int addDigits(int num) {
        int result = 0;
        while(true) {
            int temp = num % 10;
            result += temp;
            num /= 10;
            if(num == 0) {
                if(result < 10) return result;
                else {
                    num =result;
                    result = 0;
                }
            }
        }
    }
}