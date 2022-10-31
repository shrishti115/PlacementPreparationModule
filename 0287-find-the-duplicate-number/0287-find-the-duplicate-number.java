class Solution {
    public int findDuplicate(int[] nums) {
        
        
        
        int l=nums.length;
        Arrays.sort(nums);
        
        for(int i=1;i<l;i++)
        {
            int sum=nums[i-1]^nums[i];
           
            
            if(sum==0)
                return nums[i];
           
                
        }
        return 0;
    }
}
