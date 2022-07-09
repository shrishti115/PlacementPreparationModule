class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0,fsum=Integer.MIN_VALUE;
        
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(fsum<sum)
                fsum=sum;
            if(sum<0)
                sum=0;
        }
        return fsum;
    }
}