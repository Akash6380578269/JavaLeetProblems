class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        long sum = 0;
        int t = n;
        // long x = 0;
        // long p = 1;
        while (n > 0) {
            long d = n % 10;
            if (d != 0) {
                //  x = p * d + x;
                // p *= 10;
                sum += d;
            }
            n /= 10;
        }
        StringBuilder sb =new StringBuilder();
        while (t > 0) {

            int d = t % 10;
            if (d != 0)
                sb.append(d);

            t /= 10;

        }
        String s=new String(sb.reverse());
        long a = Long.parseLong(s);
        Long ans = a * sum;
        return ans;
    }
}