class Solution {
    
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        visited=new boolean[r][c];
        
         char ch=word.charAt(0);
        
        for(int i=0;i<board.length;i++)
        {
           
            
            for(int j=0;j<board[i].length;j++)
            {
                if(ch==board[i][j] && search(board,i,j,0,word))
                    return true;
                
            }
            
                
            
            
        }
        
        return false;
        
    }
    
    public boolean search(char[][]board,int i, int j, int index,String word)
    {
        if(index==word.length())
            return true;
        
        if(  i<0 ||i>=board.length|| j<0|| j>=board[i].length||word.charAt(index)!=board[i][j] || visited[i][j])
            return false;
           
     
       
        
        
      visited[i][j]=true;
           
        
       if( search(board,i+1,j,index+1,word) ||
        search(board,i-1,j,index+1,word)||
        search(board,i,j+1,index+1,word)||
         search(board,i,j-1,index+1,word))
           return true;
           
        
        
        
        visited[i][j]=false;
        return false;
    } 
      
}