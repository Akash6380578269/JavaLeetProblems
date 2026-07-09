class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int x : friends) {
            set.add(x);
        }
        List<Integer> list = new ArrayList<>();
        for (int x : order) {
            if (set.contains(x)) {
                list.add(x);
            }
        }
        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}