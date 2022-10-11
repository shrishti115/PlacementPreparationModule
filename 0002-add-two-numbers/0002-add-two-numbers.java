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
        ListNode sum=new ListNode (0);
        ListNode h3=sum;
       
        ListNode h1=l1;
        ListNode h2=l2;
        int carry=0;
        int s=sum.val;
        
        while(h1!=null || h2!=null || s!=0)
        {
            if(h1!=null)
            {
            s+=h1.val;// 2 ->3 =5
                h1=h1.next;
            }
                        if(h2!=null)
            {
            s+=h2.val;// 2 ->3 =5
                h2=h2.next;
            }
            
            h3.next=new ListNode(s%10);
            s=s/10;
           
            h3=h3.next; 
          
        }
       
        
        return sum.next;
        
        
    }
}