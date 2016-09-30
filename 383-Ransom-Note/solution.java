public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))) {
                Integer m = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), m + 1);
            }
            else {
                map.put(magazine.charAt(i), 1);
            }
        }
        for(int j = 0; j < ransomNote.length(); j++) {
            if(!map.containsKey(ransomNote.charAt(j))) {
                return false;
            }
            else {
                Integer m = map.get(ransomNote.charAt(j));
                if(m != 1) {
                    map.put(ransomNote.charAt(j), m - 1);
                }
                else {
                    map.remove(ransomNote.charAt(j));
                }
            }
        }
        return true;
    }
}