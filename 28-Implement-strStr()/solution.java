public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) return -1;
        if(needle.length() > haystack.length()) return -1;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            boolean judge = true;
            for(int j = 0; j < needle.length(); j++)
            {
                if(needle.charAt(j) != haystack.charAt(i+j))
                {
                    judge = false;
                    break;
                }
            }
            if(judge) return i;
        }
        return -1;
    }
}