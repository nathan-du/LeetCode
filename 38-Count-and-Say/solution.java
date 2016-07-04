public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if (n < 0) return s;
        while(--n > 0)
        {
            s = parse(s);
        }
        return s;
    }
    
    public String parse(String s)
    {
        String returnContent = new String();
        int count = 1;
        int i;
        for(i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
            {
                count++;
            }
            else
            {
                returnContent += Integer.toString(count) + s.charAt(i - 1); 
                count = 1;
            }
        }
        returnContent += Integer.toString(count) + s.charAt(i - 1);
        return returnContent;
    }
}