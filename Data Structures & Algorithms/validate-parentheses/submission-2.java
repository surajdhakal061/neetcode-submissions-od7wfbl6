class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> exitOpen= new HashMap<>(Map.of(')','(','}','{',']','['));
        for(char c: s.toCharArray()){
            if(exitOpen.values().contains(c)){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && stack.peek().equals(exitOpen.get(c))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        return false;

    }
}
