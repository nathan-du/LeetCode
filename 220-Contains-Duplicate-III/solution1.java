public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length <= 1 || k < 1 || t < 0) return false;
        for(int c = 1; c <= k; c++) {
            for(int i = 0; i < nums.length - c; i++) {
                int j = i + c;
                if(Math.abs(nums[i] - nums[j]) <= t && !isOutOfRange(nums[i], nums[j])) return true;
            }
        }
        return false;
    }
    
    public boolean isOutOfRange(int n1, int n2) {
        if(n1 == Integer.MAX_VALUE && n2 < 0) return true;
        if(n1 == Integer.MIN_VALUE && n2 > 0) return true;
        if(n2 == Integer.MAX_VALUE && n1 < 0) return true;
        if(n2 == Integer.MIN_VALUE && n1 > 0) return true;
        return false;
    }
}