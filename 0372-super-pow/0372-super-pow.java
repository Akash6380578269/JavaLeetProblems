import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {

        StringBuilder sb = new StringBuilder();

        for (int x : b) {
            sb.append(x);
        }

        BigInteger base = BigInteger.valueOf(a);
        BigInteger exponent = new BigInteger(sb.toString());
        BigInteger mod = BigInteger.valueOf(1337);

        return base.modPow(exponent, mod).intValue();
    }
}