public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp;
        for(int i = nums.length - k; i < nums.length; i++) {
            temp = nums[i];
            for(int j = i - 1; j >= i - nums.length + k; j--) {
                nums[j + 1] = nums [j];
            }
            nums[i - nums.length + k] = temp;
        }
    }
}