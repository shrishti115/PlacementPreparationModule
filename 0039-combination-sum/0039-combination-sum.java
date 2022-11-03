class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sum=new ArrayList<>();
            int s=0;
        sums(candidates,sum,res,target,0,s);
        
        return res;
        
        
        
    }
    public void sums(int []c, List<Integer> sum, List<List<Integer>> res,int t,int i,int s)
        
    { 
        if(s==t)
        {
            res.add(new ArrayList(sum));
            return;
        }
        if(s>t || i>=c.length)
            return;
        int n=c[i];
        s+=n;
        sum.add(n);
        sums(c,sum,res,t,i,s);
        sum.remove(sum.size()-1);
        s-=n;
        sums(c,sum,res,t,i+1,s);
        
    }
}