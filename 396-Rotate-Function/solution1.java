public class Solution {
    public int maxRotateFunction(int[] A) {
        if(A.length == 0) return 0;
        
        int sum = 0, head = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            head += A[i]*i;
        }
        
        int max = head;
        for(int j = 1; j < A.length; j++) {
            head = head - sum + A[j-1] * A.length;
            max = Math.max(max, head);
        }
        return max;
    }
}