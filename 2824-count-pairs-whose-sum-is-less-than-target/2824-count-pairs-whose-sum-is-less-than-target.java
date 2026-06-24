class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c[] = new int[nums.size()];
        int k = 0;
        for (int x : nums) {
            c[k++] = x;
        }
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] + c[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }
}