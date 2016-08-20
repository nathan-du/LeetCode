public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
		k = k % len;
		int[] res = new int[len];
		int index = 0;
		for (int i = len - k; i < len; i++) {
			res[index++] = nums[i];
		}
		for (int i = 0; i < len - k; i++) {
			res[index++] = nums[i];
		}
		for (int i = 0; i < len; i++) {
			nums[i] = res[i];
		}
    }
}