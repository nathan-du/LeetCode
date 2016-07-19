/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null && sum == 0) return false;
        if(root == null) return false;
        return judge(root, sum);
    }
    
    public boolean judge(TreeNode root, int gap)
    {
        gap -= root.val; 
        boolean result = false;
        if(root.left == null && root.right == null && gap == 0) return true;
        if(root.left == null && root.right == null && gap != 0) return false;
        if(root.left != null) 
        {
            result = judge(root.left, gap);
            if(result == true) return true;
        }
        if(root.right != null) 
        {
            result = judge(root.right, gap);
            if(result == true) return true;
        }
        return false;
    }
}