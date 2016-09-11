public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int insertPort = 0;
        for(int num : nums) {
            if(num != 0) nums[insertPort++] = num;
        }
        while(insertPort < nums.length) {
            nums[insertPort++] = 0;
        }
    }
}