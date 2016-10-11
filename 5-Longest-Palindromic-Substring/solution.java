public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        String res = null;
        boolean[][] judge = new boolean[length][length];
        for(int i = length - 1; i >= 0; i--) {
            for(int j = i; j < length; j++) {
                judge[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || judge[i + 1][j - 1]);
                if(judge[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}