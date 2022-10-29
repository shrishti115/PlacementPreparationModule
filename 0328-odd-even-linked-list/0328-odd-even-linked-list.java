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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd=new ListNode (0);
        ListNode even= new ListNode(0);
        ListNode o=odd;
        ListNode e=even;
        ListNode h=head;
        
        int count=1;
        
        if(head==null || head.next==null)
            return head;
        
        
        while(h!=null)
        
        {
            if(count%2==0){
                even.next=h;
                even=even.next;
            }
            
            else 
            {
                odd.next=h;
                odd=odd.next;
            }
                
            h=h.next;
            count++;
        }
        
        head=o.next;
        odd.next=e.next;
        even.next=null;
        
        return head;
        
    }
}