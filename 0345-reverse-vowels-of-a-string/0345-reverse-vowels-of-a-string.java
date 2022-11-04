class Solution {
    public String reverseVowels(String s) {
        
        int l=0;
        int h=s.length()-1;
        char c[]=s.toCharArray();
        
        while(l<h)
            
        {
            
            while(l<h && !vowel(c[l]))
                l++;
             while(l<h && !vowel(c[h]))
                h--;
            
            char temp=c[l];
            c[l]=c[h];
            c[h]=temp;
            
            l++;
            h--;
            
        }
        
        return new String(c);
        
    }
    public boolean vowel(char c)
    {
        if(c=='a'|| c=='A' || c=='E'|| c=='U'|| c=='O'|| c=='I'||c=='e'||c=='i'||c=='o'||c=='u')  
      return true;
        else 
          return  false;
    }
}