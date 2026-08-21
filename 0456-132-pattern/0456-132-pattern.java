class Solution {
    public boolean find132pattern(int[] nums) {
        int t2 = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < t2) {
                return true;
            }
            while (!st.isEmpty() && nums[i] > st.peek()) {
                t2 = st.pop();
            }
            st.push(nums[i]);
        }
        return false;

    }
}