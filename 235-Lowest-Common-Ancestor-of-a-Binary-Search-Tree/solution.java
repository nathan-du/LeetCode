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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p == null) return q;
        if(q == null) return p;
        if(exist(root.left, p) && exist(root.left, q)) return lowestCommonAncestor(root.left, p, q);
        else if(exist(root.right, p) && exist(root.right, q)) return lowestCommonAncestor(root.right, p, q);
        else {
            return root;
        }
        
    }
    public boolean exist(TreeNode root, TreeNode p) {
        if(root == p) return true;
        if(root == null) return false;
        return exist(root.left, p) || exist(root.right, p);
    }
}