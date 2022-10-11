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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
       return inorder(p,q);
        
        
    }
    public boolean inorder(TreeNode p, TreeNode q)
    {
        
        if(p==null && q==null)
            return true;
        
        else if(p==null || q==null)
            return false;
        
        if(p.val != q.val){
            return false;
        }
        else 
        {

        
            return inorder(p.left,q.left) && inorder(p.right,q.right);
             
        }
        
     
        
        
       
    
           
       
       
    }
    
}