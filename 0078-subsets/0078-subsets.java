class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
    ArrayList<Integer> l=new ArrayList<>();
        sub(0,nums,l,list);
        
        return list;
        
    }
     public void sub(int index,int[] nums,ArrayList<Integer>l,List<List<Integer>> list)
     {
        
         if(index>=nums.length)
         {
             list.add(new ArrayList<>(l));
         }
         
         else
         {
             l.add(nums[index]);
             sub(index+1,nums,l,list);
            l.remove(l.size()-1);
             sub(index+1,nums,l,list);
         }
     }
         
  
}