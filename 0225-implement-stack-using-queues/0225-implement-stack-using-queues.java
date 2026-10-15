class MyStack {
    private Queue<Integer> st;

    public MyStack() {
        st = new LinkedList<>();
    }

    public void push(int x) {
        int n = st.size();
        st.add(x);
        for (int i = 0; i < n; i++) {
            st.add(st.poll());
        }
    }

    public int pop() {
        return st.poll();
    }

    public int top() {
        return st.peek();
    }

    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */