class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int[] temp = arr.clone();
        Arrays.sort(temp);

        int rank = 1;
        for (int x : temp) {
            if (!map.containsKey(x)) {
                map.put(x, rank++);
            }
        }

        int[] ans = new int[arr.length];

        for (int j = 0; j < arr.length; j++) {
            ans[j] = map.get(arr[j]);
        }

        return ans;
    }
}