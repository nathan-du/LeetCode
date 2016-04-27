public class Solution {
    public String convert(String s, int numRows) {
        if(s.equals("") || numRows <= 0) return "";
        if(numRows == 1) return s;
        StringBuilder returnContent = new StringBuilder();
        int size = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++)
        {
            for(int j = i; j < s.length(); j += size)
            {
                returnContent.append(s.charAt(j));
                if(i != 0 && i != numRows - 1 && j + size - 2 * i < s.length())
                {
                    returnContent.append(s.charAt(j + size - 2 * i));
                }
            }
        }
        return returnContent.toString();
    }
}