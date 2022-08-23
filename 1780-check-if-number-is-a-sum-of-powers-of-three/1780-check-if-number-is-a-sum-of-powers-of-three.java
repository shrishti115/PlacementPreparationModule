class Solution {
    public boolean checkPowersOfThree(int n) {
    int c=0,s=1;
        
        
       while(s<=n)
        {
            s=s*3;
           c++;
        }
        
        for(int i=c;i>=0;i--)
        {
            if(Math.pow(3,i)<=n)
                n=n-(int)Math.pow(3,i);
            
        }
        if(n==0)
            return true;
        
        else 
          return  false;
        
        
    }
}