class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> st=new Stack<>();
        
    for(char key:s.toCharArray())
    {
        if(map.containsKey(key))
            st.push(key);
        
        else
        {
            if(st.isEmpty())
                return false;
            
            char popp=st.pop();
            if(!(map.get(popp)==key))
                return false;
        }
        
       
    }
         return st.isEmpty()?true:false;
    }
}