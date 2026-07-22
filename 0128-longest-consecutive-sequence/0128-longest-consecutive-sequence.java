class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int Max = 0;
        for (int x : set) {
            int count = 1;
            int curr = x;
            if (!set.contains(x - 1)) {
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
            }
            Max = Math.max(Max, count);
        }
        return Max;

    }
}