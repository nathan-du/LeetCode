public class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2) return 0;
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low < high) {
            int min = Math.min(height[low], height[high]);
            max = Math.max(max, min * (high - low));
            if(low <= high && height[low] <= min) low++;
            if(low <= high && height[high] <= min) high--;
        }
        return max;
    }
}