public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i - 1] != nums[i])) {
                int low = i + 1, high = nums.length - 1, judge = 0 - nums[i];
                while(low < high) {
                    if(nums[low] + nums[high] == judge) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[low]);
                        list.add(nums[high]);
                        list.add(nums[i]);
                        res.add(list);
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] < judge) low++;
                    else high--;
                }
            }
        }
        return res;
    }
}