class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int ans[] = new int[2];
        int i=0;
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                ans[i++] = key;
            }
        }
        return ans;
    }
}