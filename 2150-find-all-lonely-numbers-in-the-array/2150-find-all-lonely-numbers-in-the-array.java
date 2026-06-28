class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                if (!map.containsKey(key + 1) && !map.containsKey(key - 1)) {
                    list.add(key);
                }
            }
        }
        return list;
    }
}