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
    public ListNode mergeKLists(ListNode[] lists) {
        
       ArrayList <Integer> o=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
            o.add(lists[i].val);
            
            lists[i]=lists[i].next;
            }
        }
        
        
        Collections.sort(o);
        ListNode h=new ListNode();
        ListNode ans=h;
        
        for(int i=0;i<o.size();i++)
        {
            h.next=new ListNode(o.get(i));
            h=h.next;
        }
        
        
        return ans.next;
           
        
        
        
        
        
    }
}