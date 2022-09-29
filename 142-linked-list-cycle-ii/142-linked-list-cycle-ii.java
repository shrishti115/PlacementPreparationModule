/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap <ListNode, Integer> map= new HashMap<>();
        ListNode n=head;
        while(n!=null)
        {
            if(map.containsKey(n))
                return n;
            
            
            map.put(n,n.val);
            n=n.next;
        }
        return null;
    }
}