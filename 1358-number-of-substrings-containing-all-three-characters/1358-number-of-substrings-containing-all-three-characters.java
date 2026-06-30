class Solution {
    public int numberOfSubstrings(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (ch == 'a')
                a++;
            else if (ch == 'b')
                b++;
            else
                c++;

            while (a > 0 && b > 0 && c > 0) {
                ans += (s.length() - right);
                char leftchar = s.charAt(left);
                if (leftchar == 'a')
                    a--;
                else if (leftchar == 'b')
                    b--;
                else
                    c--;
                left++;
            }
        }
        return ans;

    }
}