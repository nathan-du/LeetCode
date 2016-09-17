public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null;
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> interSet = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                interSet.add(nums2[i]);
            }
        }
        int[] res = new int[interSet.size()];
        int index = 0;
        for(int num: interSet) {
            res[index++] = num;
        }
        return res;
    }
}