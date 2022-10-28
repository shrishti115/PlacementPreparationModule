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
    public ListNode partition(ListNode head, int x) {
        
        ListNode l= new ListNode(0);
        ListNode g=l;
        
        ListNode s=new ListNode(0);
        ListNode d=s;
        
        ListNode h=head;
        while(h!=null)
        {
            if(h.val<x)
            {
                s.next=h;
                s=s.next;
            }
            
        else
        {
            l.next=h;
            l=l.next;
        }
            
            h=h.next;
        }
        
        s.next=g.next;
        l.next=null;
        
        
        return d.next;
            
        
    }
}