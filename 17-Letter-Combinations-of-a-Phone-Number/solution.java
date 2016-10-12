public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        Map<Character, String> map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String[] m = new String[digits.length()];
        for(int i = 0; i < digits.length(); i++) {
            m[i] = map.get(digits.charAt(i));
        }
        rec(list, "", 0, m);
        return list;
    }
    
    public void rec(List<String> list, String temp, int now, String[] m) {
        if(now == m.length) {
            list.add(temp);
            return;
        }
        for(int i = 0; i < m[now].length(); i++) {
            String next = temp + m[now].charAt(i);
            rec(list, next, now + 1, m);
        }
    }
}