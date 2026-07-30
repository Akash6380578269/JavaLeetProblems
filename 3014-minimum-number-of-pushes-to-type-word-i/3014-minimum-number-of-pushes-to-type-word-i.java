class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());
        int push = 0;
        int index = 0;
        int cost = 0;
        for (int x : freq) {
            cost = (index / 8) + 1;
            push += x * cost;
            index++;
        }
        return push;

    }
}