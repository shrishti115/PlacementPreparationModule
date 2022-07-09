class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet <Integer> set= new HashSet <>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        if(set.size()==n)
            return false;
        
        else
            return true;
    }
}