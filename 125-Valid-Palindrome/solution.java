public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char l, r;
        while(left < right){
            while(left < s.length() && !judge(s.charAt(left))){
                left++;
            }
            while(right >= 0 && !judge(s.charAt(right))){
                right--;
            }
            
            if(left < right){
                l = s.charAt(left);
                r = s.charAt(right);
                if(judgeSame(l, r)){
                    left++;
                    right--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean judge(char a)
    {
        if((a >= '0' && a<= '9') || (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) return true;
        return false;
    }
    
    public boolean judgeSame(char a, char b)
    {
        if(a == b) return true;
        else if(a >= 'a' && a <= 'z')
        {
            if(Character.toUpperCase(a) == b) return true;
        }
        else if(a >= 'A' && a <= 'Z')
        {
            if(Character.toLowerCase(a) == b) return true;
        }
        return false;
    }
}