public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while(low < high) {
                if(nums[low] + nums[high] == target - nums[i]) return target;
                else if(nums[low] + nums[high] > target - nums[i]) {
                    while(low < high && nums[low] + nums[high] > target - nums[i]) high--;
                    if(Math.abs(target - nums[low] - nums[high + 1] - nums[i]) < Math.abs(res - target)) 
                        res = nums[low] + nums[high + 1] + nums[i];
                }
                else {
                    while(low < high && nums[low] + nums[high] < target - nums[i]) low++;
                    if(Math.abs(target - nums[low - 1] - nums[high] - nums[i]) < Math.abs(res - target)) 
                        res = nums[low - 1] + nums[high] + nums[i];
                }
            }
        }
        return res;
    }
}