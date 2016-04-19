/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.LinkedList;
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        LinkedList<TreeNode> treeNode = new LinkedList<TreeNode>();
        int count = 0;
        treeNode.add(root);
        
        while(!treeNode.isEmpty())
        {
            count++;
            LinkedList<TreeNode> temp = new LinkedList<TreeNode>();
            for(TreeNode tempTreeNode: treeNode)
            {
                if(tempTreeNode.left == null && tempTreeNode.right == null) continue;
                if(tempTreeNode.left != null && tempTreeNode.right != null)
                {
                    temp.add(tempTreeNode.left);
                    temp.add(tempTreeNode.right);
                }
                if(tempTreeNode.left == null) temp.add(tempTreeNode.right);
                if(tempTreeNode.right == null) temp.add(tempTreeNode.left); 
            }
            treeNode = new LinkedList<TreeNode>(temp);
        }
        
        return count;
    }
}