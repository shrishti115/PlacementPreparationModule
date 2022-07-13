class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
   int n=nums1.length,m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li = new ArrayList<>();
        for(int i=0,j=0; i < n && j < m;){
            if(nums1[i] == nums2[j]){
                li.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[] arr = li.stream().mapToInt(Integer::intValue).toArray();
        
       return arr;
    }
}