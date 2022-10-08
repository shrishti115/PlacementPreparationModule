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
    public boolean isPalindrome(ListNode head) {
        
        ListNode f=head;
        ListNode s=head;
        
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        
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
        
        ListNode h=head;
        while(h!=null && prev!=null)
        {
            if(h.val!=prev.val)
                return false;
            
            h=h.next;
            prev=prev.next;
                
        }
        
        return true;
        
    }
}