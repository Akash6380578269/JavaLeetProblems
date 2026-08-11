class Solution {
    public String largestGoodInteger(String num) {
        Stack<Character> st = new Stack<>();
        String Max = "";

        for (char c : num.toCharArray()) {

            while (!st.isEmpty() && st.peek() != c) {
                st.pop();
            }

            st.push(c);

            if (st.size() == 3) {

                StringBuilder str = new StringBuilder();

                while (!st.isEmpty()) {
                    str.append(st.pop());
                }

                String current = str.toString();

                if (Max.equals("") || current.compareTo(Max) > 0) {
                    Max = current;
                }
            }
        }

        return Max;
    }
}