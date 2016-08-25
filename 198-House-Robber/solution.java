public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return helper(nums, 0, nums.length - 1);
    }
    
    public int helper(int[] nums, int front, int end) {
        if(front > end) return 0;
        if(front == end) return nums[end];
        int temp1 = helper(nums, front + 1, end);
        int temp2 = helper(nums, front + 2, end);
        if(temp2 + nums[front] > temp1) return temp2 + nums[front];
        return temp1;
    }
}