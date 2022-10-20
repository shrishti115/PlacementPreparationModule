class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indices = new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                indices[0]=map.get(target-nums[i]);
                indices[1]=i;
            }
            map.put(nums[i],i);
        }

        return indices; 
            
    }
}