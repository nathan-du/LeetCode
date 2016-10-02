public class Solution {
    public int maxRotateFunction(int[] A) {
        if(A.length == 0) return 0;
        int[] f = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            int temp = 0;
            int head = A.length - i;
            for(int j = 0; j < A.length; j++) {
                if(head >= A.length) head -= A.length;
                temp += j*A[head];
                head++;
            }
            f[i] = temp;
        }
        int res = f[0];
        for(int i = 1; i < f.length; i++) {
            if(f[i] > res) res = f[i];
        }
        return res;
    }
}