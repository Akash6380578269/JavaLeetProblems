import java.util.*;

class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Convert to list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans.append(entry.getKey());
            }
        }

        return ans.toString();
    }
}