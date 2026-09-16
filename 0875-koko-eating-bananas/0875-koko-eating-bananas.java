class Solution {
    public int minEatingSpeed(int[] piles, int hr) {
        int max = 0;
        for (int x : piles) {
            max = Math.max(max, x);
        }
        int left = 1;
        int right = max;
        while (left < right) {
            int h = 0;
            int mid = (left + right) / 2;
            for (int x : piles) {
                h += (x + mid - 1) / mid;
            }
            if (h <= hr) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }
}