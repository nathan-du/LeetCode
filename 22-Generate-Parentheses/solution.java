public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        rec(n, "(", list, 1, 0);
        return list;
    }
    
    public void rec(int n, String temp, List<String> res, int left, int right) {
        if(left == n && right == n) {
            res.add(temp);
            return;
        }
        if(left < n) {
            String next = temp + "(";
            rec(n, next, res, left + 1, right);
        }
        if((right < n - 1 && right < left) || (right == n - 1 && left == n)) {
            String next = temp + ")";
            rec(n, next, res, left, right + 1);
        }
    }
}