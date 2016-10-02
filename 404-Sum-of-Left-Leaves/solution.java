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
    public int sumOfLeftLeaves(TreeNode root) {
        return right(root);
    }
    
    public int right(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return 0;
        return left(root.left) + right(root.right);
    }
    
    public int left(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        return left(root.left) + right(root.right);
    }
}