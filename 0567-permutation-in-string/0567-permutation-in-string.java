class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int a[] = new int[26];
        for (int i = 0; i < n; i++) {
            a[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s2.length() - n; i++)

        {

            int b[] = new int[26];
            for (int j = i; j < i + n; j++) {
                b[s2.charAt(j) - 'a']++;
            }
            if (isSame(a, b)) {
                return true;
            }

        }
        return false;
    }

    static boolean isSame(int a[], int b[]) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}