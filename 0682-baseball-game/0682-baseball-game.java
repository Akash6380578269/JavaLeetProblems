class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int res[] = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            String sp = operations[i];

            if (sp.equals("C")) {
                size--;
            } else if (sp.equals("D")) {
                res[size] = res[size - 1] * 2;
                size++;
            } else if (sp.equals("+")) {
                res[size] = res[size - 1] + res[size - 2];
                size++;
            } else {
                res[size] = Integer.parseInt(sp);
                size++;
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += res[i];
        }
        return sum;

    }
}