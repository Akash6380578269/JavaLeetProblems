import java.util.*;

class Solution {

    public long countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;

        for (int num : nums) {
            int g = gcd(num, k);

            for (int key : map.keySet()) {
                if (((long) g * key) % k == 0) {
                    ans += map.get(key);
                }
            }

            map.put(g, map.getOrDefault(g, 0) + 1);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}