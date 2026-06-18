class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        int count = 0;

        for (int num : nums) {

            if (set.contains(num - k) && !seen.contains(num - k)) {
                count++;
                seen.add(num - k);
            }

            if (set.contains(num + k) && !seen.contains(num)) {
                count++;
                seen.add(num);
            }

            set.add(num);
        }

        return count;
    }
}