class Solution {
    public List<List<Integer>> combine(int n, int k) {
       
       
        List<Integer> t=new ArrayList <Integer> ();
        List<List<Integer>> res=new ArrayList <>();
        
        club(t,res,n,k,1);
    
        return res;
        

        
        
        
    }
    public void club(List<Integer> t, List<List<Integer>> res,int n,int k,int i)
    {
        
        if(t.size()==k)
        {
            res.add(new ArrayList(t));
            return;
            
        }
        if(i<=n){
       t.add(i);
        club(t,res,n,k,i+1);
        t.remove(t.size()-1);
            club(t,res,n,k,i+1);
        }
    }
}