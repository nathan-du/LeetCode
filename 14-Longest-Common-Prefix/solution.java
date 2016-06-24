public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            return "";
        }
        else if(strs.length == 1)
        {
            return strs[0];
        }
        else
        {
            int count = Integer.MAX_VALUE;
            for(int i = 0; i < strs.length; i++)
            {
                if(count > strs[i].length())
                count = strs[i].length();
            }
            String prefix = "";
            for(int i = 0; i < count; i++)
            {
                char ch = strs[0].charAt(i);
                for(String str : strs)
                {
                    if(ch != str.charAt(i))
                        return prefix;
                }
                prefix += ch;
            }
            return prefix;
        }
    }
}