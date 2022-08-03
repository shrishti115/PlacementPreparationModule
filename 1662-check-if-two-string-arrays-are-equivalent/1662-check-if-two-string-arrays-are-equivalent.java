class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s="";
        for(int i=0;i<word1.length;i++)
        s+=word1[i]; 
        
        String a="";
        for(int i=0;i<word2.length;i++)
        a+=word2[i]; 
        
        if(s.equals(a))
            return true;
        
        else 
            return false;
    }
}