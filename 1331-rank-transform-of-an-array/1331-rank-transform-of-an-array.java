class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(temp[i]))
                map.put(temp[i], rank++);
        }
        int ans[] = new int[arr.length];
        //int i = 0;
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
          //  i++;
        }
        return ans;
    }
}