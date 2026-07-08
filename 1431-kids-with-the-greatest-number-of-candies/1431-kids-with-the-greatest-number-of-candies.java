class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int n = candies.length;
        // boolean ans[] = new boolean[n];

        int Max = 0;
        List<Boolean> list = new ArrayList<>();
        for (int x : candies) {
            Max = Math.max(Max, x);
        }
        // int i = 0;
        for (int x : candies) {
            if (x + e >= Max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}