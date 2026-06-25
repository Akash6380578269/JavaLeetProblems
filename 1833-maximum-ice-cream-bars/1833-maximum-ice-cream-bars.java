class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0;
        int sum = 0;
        for (int x : costs) {
            sum += x;
            if (sum > coins) {
                return c;
            }
            c++;
        }
       
        return c;
    }
}