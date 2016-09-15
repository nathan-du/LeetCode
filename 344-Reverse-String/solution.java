public class Solution {
    public String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}