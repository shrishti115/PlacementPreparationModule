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
    public ListNode deleteMiddle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
         ListNode n=null;
        
        
        while(f!=null && f.next!=null)
        {
            n=s;
            s=s.next;
            f=f.next.next;
            
        }
      
         if(n==null) 
        return null;
        
    n.next=s.next;
        
        
        
        return head;
        
       
        
    }
}