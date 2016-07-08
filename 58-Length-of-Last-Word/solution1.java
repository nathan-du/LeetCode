public class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.trim();
        return ss.length() - ss.lastIndexOf(' ') - 1;
    }
}