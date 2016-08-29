public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    
    int getNext(int n) {
        int res = 0;
        while(n > 0) {
            res += Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }
}