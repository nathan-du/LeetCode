import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++)
        {
            HashSet<Character> s = new HashSet<Character>();
            for(int j = 0; j < board[i].length; j++)
            {
                if(!isValid(s, board[i][j])) return false;
            }
        }
        
        for(int i = 0; i < board.length; i++)
        {
            HashSet<Character> s = new HashSet<Character>();
            for(int j = 0; j < board[i].length; j++)
            {
                if(!isValid(s, board[j][i])) return false;
            }
        }
        
        for(int index_y = 0; index_y <= 6; index_y += 3)
        {
            for(int index_x = 0; index_x <= 6; index_x +=3)
            {
                HashSet<Character> s = new HashSet<Character>();
                for(int i = 0; i <= 2; i++)
                {
                    for(int j = 0; j <= 2; j++)
                    {
                        if(!isValid(s, board[index_x + j][index_y + i])) return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    public boolean isValid(HashSet<Character> s, char c)
    {
        if(c != '.' && !s.contains(c))
        {
            s.add(c);
        }
        else if(c != '.' && s.contains(c))
        {
            return false;
        }
        return true;
    }
}