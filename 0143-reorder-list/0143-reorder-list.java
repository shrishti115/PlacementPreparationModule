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
        
        if(head==null || head.next==null)
            return;
        
        ListNode f=head; 
        ListNode s=head;
        ListNode pv=null;
        
        while(f!=null && f.next!=null)
        {
            pv=s;
            f=f.next.next;
            s=s.next;
        }
        
        pv.next=null;
        ListNode curr=s;
       
       
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
        while(t!=null){
          s=t.next;
            f=prev.next;
            
            t.next=prev;
             if(s==null)
                break;
            prev.next=s;
            
           
            t=s;
            prev=f;
            
            
        }
        
        
    }
}