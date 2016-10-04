public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                if(set.size() > length) length = set.size();
                if(s.charAt(i - 1) == s.charAt(i)) {
                    set = new HashSet();
                    set.add(s.charAt(i));
                }
            }
            else {
                set.add(s.charAt(i));
            }
        }
        if(set.size() > length) length = set.size();
        return length;
    }
}