class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //int j=0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            boolean found = false;
            int m = arr1[i];
            while (j < arr2.length) {
                if ((Math.abs(m - arr2[j])) <= d) {
                    found = true;
                    break;
                }
                j++;
            }
            if (!found) {
                count++;
            }

        }
        return count;

    }
}