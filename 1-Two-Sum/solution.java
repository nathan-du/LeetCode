public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnContent = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    returnContent[0] = i;
                    returnContent[1] = j;
                }
            }
        }
        return returnContent;
    }
}