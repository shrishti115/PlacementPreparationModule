class Solution {
    public int pivotIndex(int[] nums) {
      int l=0;
            int n=nums.length-1;
        int s1=0;
        
        for(int i=0;i<=n;i++)
            l+=nums[i];
        
        for(int i=0;i<=n;i++)
        {
            
           if(i==0)
               s1=0;
            
            else
                s1+=nums[i-1];
            
            l-=nums[i];
            
            if(s1==l)
                return i;
            
        }
        
        return -1;
    }
}