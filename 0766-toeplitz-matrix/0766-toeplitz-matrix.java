class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int same=matrix[0][0];
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[i].length;j++)
            {
                
               
                    if(matrix[i-1][j-1]==matrix[i][j])
                        continue;
                    else
                        return false;
                }
            }
        
        
        return true;
    }
}