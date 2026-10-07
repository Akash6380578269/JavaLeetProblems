class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int x : arr1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map.get(arr2[i]); j++) {
                arr1[k++] = arr2[i];
            }
            map.remove(arr2[i]);

        }
         for (int x : map.keySet()) {

            int count = map.get(x);

            for (int j = 0; j < count; j++) {
                arr1[k++] = x;
            }
        }

        return arr1;

    }
}