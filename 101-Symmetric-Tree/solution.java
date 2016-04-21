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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    boolean isMirror(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) return true;
        if(left == null) return false;
        if(right == null) return false;
        if(left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left); 
    }
}