public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle = 0;
        while(low < high) {
            middle = low + (high - low) / 2;
            if(nums[middle] > target) high = middle - 1;
            else if(nums[middle] < target) low = middle + 1;
            else {
                return middle;
            }
        }
        if(nums[low] < target) return low + 1;
        return low;
        
        
    }
}
