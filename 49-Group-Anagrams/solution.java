public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for(String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String temp = String.valueOf(ca);
            if(!map.containsKey(temp)) map.put(temp, new ArrayList<String>());
            map.get(temp).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
