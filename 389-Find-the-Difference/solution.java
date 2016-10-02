public class Solution {
    public char findTheDifference(String s, String t) {
        int[] m = new int[26];
        for(int i = 0; i < s.length(); i++) {
            m[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++) {
            m[t.charAt(j) - 'a']--;
        }
        for(int k = 0; k < m.length; k++) {
            if(m[k] == -1) {
                return (char)(k + 97);
            }
        }
        return '0';
    }
}