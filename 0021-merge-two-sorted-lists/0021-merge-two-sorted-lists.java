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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode h=new ListNode (0);
        ListNode n=h;
        if(list1==null)
            return list2;
        
        if(list2==null)
            return list1;
        
        while(list1!=null && list2!=null)
        {
            if(list2.val<=list1.val)
            {
                n.next=list2;
                list2=list2.next;
                
            }
            
            else
            {
                n.next=list1;
                list1=list1.next;
            }   
            
            n=n.next;
            
            
        }
        
        if(list1!=null)
            n.next=list1;
        
        if(list2!=null)
            n.next=list2;
        
        
        
       return h.next;
          
        
    }
}