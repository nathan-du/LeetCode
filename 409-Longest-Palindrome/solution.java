public class Solution {
    public int longestPalindrome(String s) {
        int[] m = new int[52];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 'a') m[s.charAt(i) - 'A']++;
            else m[s.charAt(i) - 'a' + 26]++;
        }
        int length = 0;
        boolean judge = false;
        for(int j = 0; j < m.length; j++) {
            if(m[j] != 0 && m[j] % 2 == 0) length += m[j];
            else if(m[j] != 0) {
                judge = true;
                length += m[j] - 1;
            }
        }
        return judge? length + 1 : length;
        }
}