public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int[] x = {A, C, E, G};
        int[] y = {B, D, F, H};
        Arrays.sort(x);
        Arrays.sort(y);
        int cover = 0;
        if(E > C || G < A || F > D || B > H) {
            cover = 0;
        }
        else {
            cover = (x[2] - x[1]) * (y[2] - y[1]);
        }
        return (C - A) * (D - B) + (G - E) * (H - F) - cover;
    }
} 