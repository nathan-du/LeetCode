public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() < nums.length;
    }
}