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
    
    int min=Integer.MAX_VALUE;
    int second=Integer.MAX_VALUE;
    boolean f=false;
    public int findSecondMinimumValue(TreeNode root) {
        
        if(root==null)
            return 0;
        
        
        if(root.val<min)
            min=root.val;
    
        else if(min<root.val && root.val<=second)
        {
            f=true;
            second=root.val;
        }
        
        findSecondMinimumValue(root.left);
         findSecondMinimumValue(root.right);
        
        
        return (f)? second: -1;
        
    }
}