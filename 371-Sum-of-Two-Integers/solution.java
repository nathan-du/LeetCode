public class Solution {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int res = (a & b) << 1;
        return sum + res;
    }
}