class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        
        int m=nums1.length;
        int o=nums2.length;
        double median=0.0;
        int arr[]=new int[m+o];
        while(i< nums1.length && j<nums2.length)
        { 
            if(nums1[i]<=nums2[j])
            {
                arr[k]=nums1[i];
                k++;
                i++;
                }
           
            
            else
            {
                arr[k]=nums2[j];
                
                j++;
                k++;
            }
        }
              
            while(i<nums1.length)
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            
            while(j<nums2.length)
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
            
        
        
        int n=arr.length;
          int mid=(n-1)/2;
        
        if(n%2==0)
        {
           
            median=(arr[mid]+arr[mid+1])/2.0;
          
        }
        
        else{
            
            median=arr[mid];
            
            } 
          return  median;
    }
        
      
    }
