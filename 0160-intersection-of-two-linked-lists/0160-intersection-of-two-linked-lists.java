/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode s=headA;
        ListNode f=headB;
        
        while(s!=f)
        {
            s= (s!=null)? s.next:headB;
            f=  (f!=null)? f.next:headA;
        }
        
        return s;
    }
}