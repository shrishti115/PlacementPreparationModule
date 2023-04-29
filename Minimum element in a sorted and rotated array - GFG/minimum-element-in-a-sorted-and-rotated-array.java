//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int nums[], int n)
    {
        //complete the function here
         int start = 0;
        int end = nums.length - 1;
        int mid=0;
        while (start < end) {
             mid = start + (end - start) / 2;

        

            if (nums[start]<=nums[mid] && nums[mid]>=nums[end]) {
                start = mid + 1;
                
            } else
                end = mid;
            }
        
        return nums[start];
    }
}
