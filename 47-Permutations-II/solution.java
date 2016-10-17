public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backTrack(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, boolean[] used) {
        if(tempList.size() == nums.length) list.add(new ArrayList<Integer>(tempList));
        else {
            for(int i = 0; i < nums.length; i++) {
                if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backTrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
