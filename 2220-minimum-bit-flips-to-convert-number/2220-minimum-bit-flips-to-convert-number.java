class Solution {
    public int minBitFlips(int x, int y) {
         int xor = x ^ y;
         int count = Integer.bitCount(xor);
         
         return count;
    }
}