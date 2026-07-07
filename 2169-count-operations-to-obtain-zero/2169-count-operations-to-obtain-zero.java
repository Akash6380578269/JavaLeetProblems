class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 & num2 != 0) {
            int sum = 0;
            if (num1 >= num2) {
                sum = num1 - num2;
                num1 = sum;
            } else {
                sum = num2 - num1;
                num2 = sum;
            }
            count++;
        }
        return count;

    }
}