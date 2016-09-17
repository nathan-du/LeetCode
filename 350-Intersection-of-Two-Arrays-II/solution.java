public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> interList = new LinkedList<Integer>();
        for(int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(list.contains(nums2[i])) {
                interList.add(nums2[i]);
                list.remove(list.indexOf(nums2[i]));
            }
        }
        int index = 0;
        int[] res = new int[interList.size()];
        for(int num: interList) {
            res[index++] = num;
        }
        return res;
    }
}