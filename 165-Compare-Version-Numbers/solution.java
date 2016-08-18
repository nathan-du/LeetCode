public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int length = Math.max(v1.length, v2.length);
        
        for(int i = 0; i < length; i++)
        {
            Integer v1Temp = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer v2Temp = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            
            int judge = v1Temp.compareTo(v2Temp);
            if(judge != 0)
            {
                return judge;
            }
        }
        return 0;
    }
}