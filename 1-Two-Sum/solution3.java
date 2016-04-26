import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                int[] returnContent = {map.get(target - nums[i]), i};
                return returnContent;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solution");
    }
}