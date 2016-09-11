public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null && str == null) return true;
        if(pattern == null) return false;
        if(str == null) return false;
        String[] strr = str.split(" ");
        if(pattern.length() != strr.length) return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < strr.length; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(strr[i])) return false;
            }
            else {
                if(map.containsValue(strr[i])) return false;
                map.put(pattern.charAt(i), strr[i]);
            }
        }
        return true;
    }
}