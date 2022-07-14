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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1, p2=l2; 
        ListNode head = new ListNode(0); 
        ListNode curr = head; 
        int sum = head.val; 
        
        
        while (p1!=null || p2!=null || sum!=0) { 
            if (p1!=null) { 
                sum += p1.val; 
                p1 = p1.next; 
            }
            if (p2!=null) { 
                sum += p2.val; 
                p2 = p2.next; 
            }
            
            curr.next = new ListNode(sum%10); 
            sum /= 10; 
            curr = curr.next; 
        }
        
        return head.next; 
        
    }
}