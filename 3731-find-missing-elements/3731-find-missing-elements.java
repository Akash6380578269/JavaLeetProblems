class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x > Max) {
                Max = x;
            }
            if (x < Min) {
                Min = x;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        for (int i = Min; i <= Max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}