class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        double num = 0;

        // Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Sign
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // Number
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            // Check immediately
            if (num * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (num * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(num * sign);
    }
}