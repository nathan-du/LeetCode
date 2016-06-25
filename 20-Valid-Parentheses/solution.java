import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        if(s == null)
        {
            return true;
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        map.put('(', ')');
        map.put('{','}');
        map.put('[',']');
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else
            {
                if(stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if(map.get(ch) != s.charAt(i))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}