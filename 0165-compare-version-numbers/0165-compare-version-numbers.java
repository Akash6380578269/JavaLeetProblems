class Solution {
    public int compareVersion(String ve1, String ve2) {
        String[] v1 = ve1.split("\\.");
        String[] v2 = ve2.split("\\.");
        int n = Math.max(v1.length, v2.length);

        for (int i = 0; i < n; i++) {
            int num1 = 0;
            int num2 = 0;
            if (i < v1.length) {
                num1 = Integer.parseInt(v1[i]);
            } else {
                num1 = 0;
            }
            if (i < v2.length) {
                num2 = Integer.parseInt(v2[i]);
            } else {
                num2 = 0;
            }

            if (num1 > num2)
                return 1;

            if (num1 < num2)
                return -1;
        }

        return 0;
    }
}