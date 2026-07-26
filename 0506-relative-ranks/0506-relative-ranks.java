class Solution {
    public String[] findRelativeRanks(int[] score) {

        int[] copy = score.clone();
        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = copy.length - 1; i >= 0; i--) {
            map.put(copy[i], rank++);
        }

        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {

            int r = map.get(score[i]);

            if (r == 1)
                ans[i] = "Gold Medal";
            else if (r == 2)
                ans[i] = "Silver Medal";
            else if (r == 3)
                ans[i] = "Bronze Medal";
            else
                ans[i] = String.valueOf(r);
        }

        return ans;
    }
}