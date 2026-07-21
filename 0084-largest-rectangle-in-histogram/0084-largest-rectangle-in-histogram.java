class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int psi[] = new int[n];
        int nxt[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                psi[i] = -1;
            } else {
                psi[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nxt[i] = n;
            } else {
                nxt[i] = st.peek();
            }
            st.push(i);
        }
        int Max = 0;

        for (int i = 0; i < n; i++) {
            int w = nxt[i] - psi[i] - 1;
            int area = h[i] * w;
            Max = Math.max(Max, area);
        }
        return Max;

    }
}