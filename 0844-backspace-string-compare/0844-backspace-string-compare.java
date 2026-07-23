class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!st1.isEmpty())
                    st1.pop();
            } else
                st1.push(c);
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!st2.isEmpty())
                    st2.pop();
            } else
                st2.push(c);
        }
        String n1 = "";
        String n2 = "";
        for (char x : st1) {
            n1 += x;
        }
        for (char x : st2) {
            n2 += x;
        }
        return n1.equals(n2);

    }
}