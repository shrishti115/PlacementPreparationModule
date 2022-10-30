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
    public void reorderList(ListNode head) {
        
        ListNode f=head; 
        ListNode s=head;
        
        while(f!=null && f.next!=null)
        {
            
            f=f.next.next;
            s=s.next;
        }
        
        
        ListNode curr=s.next;
        s.next=null;
       
        ListNode prev=null;
        ListNode n=null;
        
        while(curr!=null)
        {
            
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
            
}
        ListNode t=head;
        while(t!=null && prev!=null){
          s=t.next;
            f=prev.next;
            
            t.next=prev;
            prev.next=s;
            
            t=s;
            prev=f;
            
            
        }
        
        
    }
}