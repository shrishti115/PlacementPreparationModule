class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
            int h=nums.length-1;
        int s1=0;
        
        for(int i=0;i<=h;i++)
            l+=nums[i];
        
        
        for(int i=0;i<=h;i++)
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