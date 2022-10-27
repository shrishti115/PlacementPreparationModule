/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode curr=head;
        int count=1;
        ListNode h=null;
        
        if(head==null || head.next==null)
            return head;
        while(curr!=null)
        {
            
             if(count%2==0)
                swap(h,curr);
            
            h=curr;            
            curr=curr.next;
            count++;
                
        }
        
        return head;
        
        
        
    }
    public void swap(ListNode curr, ListNode n)
    {
        int temp=curr.val;
        curr.val=n.val;
        n.val=temp;
    }
}