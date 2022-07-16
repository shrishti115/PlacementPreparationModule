class Solution {
    public boolean isValid(String s) {
         HashMap<Character, Character> map = new HashMap<>();
        
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack<Character> charStack = new Stack<>();
        
        for (char key : s.toCharArray()) {
            if (map.containsKey(key)) {
                charStack.push(key);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char popped = charStack.pop();
                if (!(map.get(popped) == key)) {
                    return false;
                }
            }
        }
        return charStack.isEmpty() ? true : false;
        
        
    }
}