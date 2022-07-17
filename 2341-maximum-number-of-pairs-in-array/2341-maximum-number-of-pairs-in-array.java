class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        Arrays.sort(nums);
        int pair=0;
        int count=0;
        int arr[]=new int[2];
        
        
        for(int i=0;i<nums.length;)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {  
                i+=2;
            pair++;
            }
            
            else 
            {
                count++;
                i++;
            }
                
        }
        
        
        arr[0]=pair;
        arr[1]=count;
        
        return arr;
        
    }
}
