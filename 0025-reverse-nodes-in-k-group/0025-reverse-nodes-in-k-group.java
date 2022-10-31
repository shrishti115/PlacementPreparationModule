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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int p=k;
        ListNode h=head;
        while(p>0)
        {
            if(h==null)
                return head;
            h=h.next;
            p--;
        }
        
        ListNode curr=head;
       ListNode prev=null;
        ListNode n=null;
        
       for(int i=0;i<k;i++)
       {
           n=curr.next;
           curr.next=prev;
           prev=curr;
           curr=n;
           
       }
        
        head.next=reverseKGroup(curr,k);
        
        return prev;
    }
}