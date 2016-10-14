public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] res = new int[2];
        while(low < high) {
            int middle = low + (high - low) / 2;
            if(nums[middle] < target) low = middle + 1;
            else high = middle;
        }
        
        if(nums[low] != target) res[0] = -1;
        else res[0] = low;
        
        high = nums.length - 1;
        while(low < high) {
            int middle = low + (high - low) / 2 + 1;
            if(nums[middle] > target) high = middle - 1;
            else low = middle;
        }
        if(nums[high] != target) res[1] = -1;
        else res[1] = high;
        return res;
    }
}
