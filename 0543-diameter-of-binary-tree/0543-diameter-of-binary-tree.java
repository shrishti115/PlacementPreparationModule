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
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter(root);
        return ans;
        
        
    }
    int ans=0;
    public int diameter(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int l=diameter(root.left);
        int r=diameter(root.right);
        ans=Math.max(ans,l+r);
        return Math.max(l,r)+1;
    }
}