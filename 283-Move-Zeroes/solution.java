public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                int j = i + 1;
                for(; j < nums.length; j++) {
                    if(nums[j] != 0) break;
                }
                if(j != nums.length) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}