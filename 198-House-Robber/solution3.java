public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        result[2] = Math.max(result[1], result[0] + nums[2]);
        for(int i = 3; i < nums.length; i++) {
            int temp = Math.max(result[i - 3] + nums[i], result[i - 2] + nums[i]);
            result[i] = Math.max(temp, result[i - 1]);
        }
        return result[nums.length - 1];
    }
    
}