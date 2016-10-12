public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 3; i++) {
            for(int j = i + 1; j < nums.length - 2; j++) {
                int low = j + 1, high = nums.length - 1;
                int judge = target - nums[i] - nums[j];
                while(low < high) {
                    if(nums[low] + nums[high] == judge) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);
                        if(!list.contains(temp)) 
                            list.add(temp);
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        high--;
                        low++;
                    }
                    else if(nums[low] + nums[high] < judge) low++;
                    else high--;
                }
            }
        }
        return list;
    }
}