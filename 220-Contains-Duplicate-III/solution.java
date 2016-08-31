public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int c = 1; c <= k; c++) {
            for(int i = 0; i < nums.length -c; i++) {
                int j = i + c;
                long m = nums[i] - nums[j];
                if(Math.abs(m) <= t) return true;
            }
        }
        return false;
    }
}