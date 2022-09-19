class Solution {
    public int kthGrammar(int n, int k) {
        int a=0;
        if(n==1 && k==1)
            return 0;
        
        int mid= (int)Math.pow(2,n-1)/2;
        if(k>mid)
        {
           a= 1-kthGrammar (n-1, k-mid);
        }
        else 
            a=kthGrammar(n-1,k);
        
        return a;
    }
}