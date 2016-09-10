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
    List<String> res = new LinkedList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return res;
        StringBuilder path = new StringBuilder();
        
        find(root, path);
        return res;

    }
    
    public void find(TreeNode root, StringBuilder path) {
        if(root.left == null && root.right == null) {
            path.append(root.val);
            res.add(path.toString());
            path.delete(path.length() - String.valueOf(root.val).length(), path.length());
            return;
        }
        path.append(root.val + "->");
        if(root.left != null) {
            find(root.left, path);
        }
        if(root.right != null) {
            find(root.right, path);
        }
        path.delete(path.length() - 2 - String.valueOf(root.val).length(), path.length());
    }
}