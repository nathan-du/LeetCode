public class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        while(index > 0 && nums[index - 1] >= nums[index]) {
            index--;
        }
        if(index == 0) {
            Arrays.sort(nums);
            return;
        }
        int minIndex = -1, value = Integer.MAX_VALUE;
        for(int i = index; i < nums.length; i++) {
            if(nums[i] < value && nums[i] > nums[index - 1]) {
                value = nums[i];
                minIndex = i;
            }
        }
        nums[minIndex] = nums[index - 1];
        nums[index - 1] = value;
        Arrays.sort(nums, index, nums.length);
    }
}