import java.util.LinkedList;

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
    public int minDepth(TreeNode root){  
        if(root == null) return 0;
        
        LinkedList<TreeNode> treeNode = new LinkedList<TreeNode>();
        LinkedList<Integer> count = new LinkedList<Integer>();
        treeNode.add(root);
        count.add(1);
        
        while(!treeNode.isEmpty())
        {
            TreeNode curr = treeNode.poll();
            int currCount = count.poll();
            if(curr.left != null)
            {
                treeNode.add(curr.left);
                count.add(currCount + 1);
            }
            if(curr.right != null)
            {
                treeNode.add(curr.right);
                count.add(currCount + 1);
            }
            if(curr.left == null && curr.right == null)
            return currCount;
        }
        return 0;
    }  
}
