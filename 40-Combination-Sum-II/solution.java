public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(candidates, target, list, temp, 0);
        return list;
    }
    
    public void helper(int[] candidates, int target, List<List<Integer>> list, List<Integer> temp, int start) {
        if(target == 0) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        else if(target > 0) {
            for(int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) //remove duplicates.
			        continue;
                if(target - candidates[i] >= 0) {
                    List<Integer> m = new ArrayList<Integer>(temp);
                    m.add(candidates[i]);
                    helper(candidates, target - candidates[i], list, m, i + 1);
                }
            }
        }

    }
}
