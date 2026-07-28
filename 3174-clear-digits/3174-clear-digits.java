class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Character.isDigit(c)){
              st.pop();
            }
            else
            st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
       // sb.reverse();
        return sb.toString();
    }
}