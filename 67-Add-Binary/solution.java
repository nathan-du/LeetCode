public class Solution {
    public String addBinary(String a, String b) {
        if(a == null) return a;
        if(b == null) return b;
        
        int time = 0;
        boolean judge = false;
        StringBuilder res = new StringBuilder();
        
        if(a.length() <= b.length()) time = a.length();
        else time = b.length();
    
        
        for(int i = 0; i < time; i++)
        {
            if(!judge)
            {
                char m = add(a.charAt(a.length() - i - 1), b.charAt(b.length() - i - 1));
                if(m == '2') 
                {
                    judge = true;
                    res.insert(0, '0');
                }
                else 
                {
                    judge = false;
                    res.insert(0, m);
                }
            }
            else
            {
                char m = addJ(a.charAt(a.length() - i - 1), b.charAt(b.length() - i - 1));
                if(m == '1')
                {
                    judge = false;
                    res.insert(0, m);
                }
                else if(m == '2')
                {
                    judge = true;
                    res.insert(0, '0');
                }
                else if(m == '3')
                {
                    judge = true;
                    res.insert(0, '1');
                }
            }
        }
        if(a.length() == b.length()) 
        {
            if(!judge) return res.toString();
            else
            {
                res.insert(0, '1');
                return res.toString();
            }
        }
        else if(a.length() < b.length()) return addLeft(b, a, res, judge, time);
        else if(a.length() > b.length()) return addLeft(a, b, res, judge, time);
        return res.toString();
            
        
        
        
    }
    
    public char add(char a, char b)
    {
        if(a == '0' && b == '0') return a;
        if(a == '0' && b == '1') return b;
        if(a == '1' && b == '0') return a;
        return '2';
    }
    
    public char addJ(char a, char b)
    {
        if(a == '0' && b == '0') return '1';
        if((a == '0' && b == '1') || (a == '1' && b == '0')) return '2';
        return '3';
    }
    
    public String addLeft(String a, String b, StringBuilder res, boolean judge, int time)
    {
        if(judge)
        {
            for(int i = 0; i + time < a.length(); i++)
            {
                char m = add(a.charAt(a.length() - i - time - 1), '1');
                if(m == '2')
                {
                    res.insert(0, '0');
                    if(i + 1 + time == a.length())
                    {
                        res.insert(0, '1');
                    }
                }
                else
                {
                    res.insert(0, m);
                    for(i = i + 1;i + time < a.length(); i++)
                    {
                        res.insert(0, a.charAt(a.length() - i - time - 1));
                    }
                    return res.toString();
                }
                
            }
            return res.toString();
        }
        else
        {
            for(int i = 0; i + time < a.length(); i++)
            {
                res.insert(0, a.charAt(a.length() - i - time - 1));
            }
            return res.toString();
        }
    }
}