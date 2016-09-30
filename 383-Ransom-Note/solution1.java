public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cs = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            cs[magazine.charAt(i) - 'a']++;
        }
        for(int j = 0; j < ransomNote.length(); j++) {
            if((--cs[ransomNote.charAt(j) - 'a']) < 0) return false;
        }
        return true;
    }
}