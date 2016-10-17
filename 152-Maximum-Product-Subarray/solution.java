public class Solution {
    public int maxProduct(int[] nums) {
        int[] po = new int[nums.length];
        int[] ne = new int[nums.length];
        int max;
        if(nums[0] >= 0) {
            po[0] = nums[0];
            ne[0] = 1;
            max = po[0];
        }
        else {
            ne[0] = nums[0];
            po[0] = 1;
            max = ne[0];
        }
        
        for(int i = 1; i < nums.length; i++) {
            int temp1 = po[i - 1] * nums[i];
            int temp2 = ne[i - 1] * nums[i];
            po[i] = Math.max(nums[i], Math.max(temp1, temp2));
            ne[i] = Math.min(nums[i], Math.min(temp1, temp2));
            max = Math.max(max, po[i]);
        }
        return max;
    }
}
