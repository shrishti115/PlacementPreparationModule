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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode h=head;
        if(h==null)
            return head;
        
        ListNode curr=head.next;
        ListNode dummy=new ListNode(-1);
         ListNode n=dummy;
        int sum=0;
        while(curr!=null)
        {
            
            if(curr.val==0)
            {
               n.next=new ListNode(sum);
                n=n.next;
                
                sum=0;
            }
                
            sum+=curr.val;
            curr=curr.next;
            
        }
        
        return dummy.next;
        
    }
}