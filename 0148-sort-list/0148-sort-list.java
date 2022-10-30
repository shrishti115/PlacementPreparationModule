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
        
        ListNode s=head;
        ListNode f=head;
        ListNode prev=null;
        
        while(f!=null && f.next!=null)
        {
            prev=s;
            s=s.next;
            f=f.next.next;
            
        }
        
        prev.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(s);
        
      return  merge(left,right);
    }
    public ListNode merge(ListNode l, ListNode r)
    {
        
        ListNode h=new ListNode();
        ListNode ans=h;
        if(l==null)
            return r;
        if(r==null)
            return l;
        
        while(l!=null && r!=null)
        {
            if(l.val<=r.val)
            {
                h.next=l;
                l=l.next;
            }
            else
            {
                h.next=r;
                r=r.next;
            }
            h=h.next;
        } 
            if(l!=null)
            {
                h.next=l;
            }
            
            if(r!=null)
            {
                h.next=r;
            }
                
        return ans.next;
    }
    
}