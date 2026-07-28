class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int even = 0;
        int odd = 0;
        int sp=s.length()-1;
        for (int i = 0; i < s.length(); i++) {
              sp--;
            if (s.charAt(i) == '1') {
                if (sp % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = odd;
        ans[1] = even;
        return ans;
    }
}