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
    int maxPath=0;
    public int maxPathSum(TreeNode root) {
        
        
        maxPath=root.val;
        max(root);
        return maxPath;   
    }
    public int max(TreeNode root)
    {
         if(root==null)
             return 0;
        
        int l=max(root.left);
        int h=max(root.right);
        
        l=Math.max(l,0);
         h=Math.max(h,0);
        
        
       maxPath = Math.max(maxPath, root.val + l + h);
        return root.val + Math.max(l, h);
        
        
        
    }
}