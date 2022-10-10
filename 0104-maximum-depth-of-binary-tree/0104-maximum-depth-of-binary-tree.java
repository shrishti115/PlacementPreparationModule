/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
       return inorder(root);
        
    }
    
    public int inorder(TreeNode root)
    {
       if(root==null)
           return 0;
        
        
        int lh= inorder(root.left);
       
        int r=inorder(root.right);
        
        return Math.max(lh,r)+1;
    }
}