class Solution {
    public int maxProfit(int[] prices) {
         
        int s=prices[0];
        int sum=0;
        int max=0;
        
        for(int i=1;i<prices.length;i++)
        {
            if(s<prices[i])
            {
                sum=Math.abs(prices[i]-s); 
                if(max<sum)
                    max=sum;
            }
            
           else 
               s=prices[i];
        }
        
        return max;
        
    }
}