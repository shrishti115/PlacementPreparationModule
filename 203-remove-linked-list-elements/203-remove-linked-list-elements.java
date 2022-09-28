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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=new ListNode(0);
        t.next=head;
        ListNode s=t;
        while(t!=null && t.next!=null)
        {
            if(t.next.val!=val)
                t=t.next;
            else
                t.next=t.next.next;
        }
        
        return s.next;
        
    }
}