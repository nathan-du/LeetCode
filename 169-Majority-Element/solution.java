public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int times = map.get(nums[i]) + 1;
                if(times > length/2) return nums[i];
                map.put(nums[i], times);
            }
        }
        return nums[0];
    }
}