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
    public ListNode sortList(ListNode head) {
      ListNode t=head;
        
        if(head==null || head.next==null)
            return head;
        
        ArrayList<Integer> array=new ArrayList<>();
        
        while(t!=null)
        {
            array.add(t.val);
            t=t.next;
        }
        
        Collections.sort(array);
      
        
        ListNode h=new ListNode();
        ListNode ans=h;
        for(int i=0;i<array.size();i++)
        {
            h.next=new ListNode(array.get(i));
            h=h.next;
        }
       
        return ans.next;
    }
}