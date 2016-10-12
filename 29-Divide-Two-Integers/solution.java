public class Solution {
    public int divide(int dividend, int divisor) {
        int temp = 0;
        int judge = 0;
        while(temp < dividend) {
            temp += divisor;
            judge++;
        }
        if(temp == dividend) return judge;
        else return judge - 1;
    }
}