class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          
        Stack<Integer> s=new Stack<>();
        
       
        
        for(int i:asteroids)
        {
            if(i>0)
                s.push(i);
            else 
            {
               while( !s.isEmpty() && s.peek()>0 && Math.abs(i)>s.peek())
                s.pop();
            
            
            
             if(s.isEmpty() ||s.peek()<0)
                s.push(i);
                
                else if(s.peek()==Math.abs(i))
            s.pop();
                
                
        }
        }
        
        int ans[]=new int[s.size()];    
        for(int i=ans.length-1;i>=0;i--)
        {
            if(s.size()==0)
                return ans;
            ans[i]=s.peek();
           s.pop();
        }
        return ans;
        
    
    }
}