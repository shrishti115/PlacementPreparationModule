class Solution {
    public String removeDuplicates(String s) {
        
        
        Stack<Character> st=new Stack<>();
        
       if(st.size()==0)
           st.push(s.charAt(0));
        
      for(int i=1;i<s.length();i++)
      {
          
           
          if(!st.isEmpty()&&st.peek()==s.charAt(i))
          {
              st.pop();
              continue;
          }
             
          
         
               st.push(s.charAt(i));
          
          
          
         
      }
        
      StringBuilder res=new StringBuilder();
        while(st.size()!=0)
        {
           res.append(st.pop());
            
        }
       
        
        return String.valueOf(res.reverse()) ; 
    }
}