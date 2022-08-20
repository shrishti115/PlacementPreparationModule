class Solution {
    public String addStrings(String x, String y) {
        StringBuilder res= new  StringBuilder();
        int i=x.length()-1;
        int j=y.length()-1;
        int carry=0;
        
        
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            {
                sum+=x.charAt(i--)-'0';
            }
            if(j>=0)
            {
                sum+=y.charAt(j--)-'0';
            }
            
            res.append(sum%10);
            carry=sum/10;
            
           
        }
         if(carry!=0)
                res.append(carry);
        
        return res.reverse().toString();
        
    }   
}