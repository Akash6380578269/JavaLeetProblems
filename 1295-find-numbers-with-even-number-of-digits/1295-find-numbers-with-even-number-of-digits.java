class Solution {
    public int findNumbers(int[] arr) {

        String[] strArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (strArr[i].length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}