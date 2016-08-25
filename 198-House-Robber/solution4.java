public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int sum1 = 0;
        int sum2 = 0;
        for(int num: nums) {
            int temp = sum2;
            sum2 = Math.max(sum1 + num, sum2);
            sum1 = temp;
        }
        return sum2;
    }
    
}