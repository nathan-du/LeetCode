public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backTrack(list, new ArrayList<Integer>(), nums);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length) list.add(new ArrayList<Integer>(tempList));
        else{
            for(int i = 0; i < nums.length; i++) {
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backTrack(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
            }
        }
    }
}
