class Solution {
    public int smallestNumber(int n, int t) {

        while (n>=0) {
            int te = n;
            int pr = 1;
            while (te != 0) {
                int d = te % 10;
                pr *= d;
                te /= 10;
            }
            if (pr % t == 0) {
                return n;
            }
            n++;
        }

        return -1;
    }
}