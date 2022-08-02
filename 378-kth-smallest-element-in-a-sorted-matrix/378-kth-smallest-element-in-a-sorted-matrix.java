class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        int a[]=new int[n*m];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                a[count]=matrix[i][j];
                count++;
            }
            
        }
        
        Arrays.sort(a);
        
        return a[k-1];
        
        
        
    }
}