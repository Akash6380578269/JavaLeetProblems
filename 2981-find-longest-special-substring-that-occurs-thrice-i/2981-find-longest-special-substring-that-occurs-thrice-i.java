class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int MaxLen = -1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                temp += s.charAt(j);
                if(isValid(temp)) {
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                }
            }
        }
        for (String str : map.keySet()) {
            if (map.get(str) >= 3) {
                MaxLen = Math.max(MaxLen, str.length());
            }
        }
        return MaxLen;
    }

    static boolean isValid(String s) {
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (c != s.charAt(i))
                return false;
        }
        return true;
    }
}