class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> a = new HashSet<>();
        Set<Character> b = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                a.add(c);
            } else {
                b.add(Character.toLowerCase(c));
            }
        }
        int count = 0;
        for (char c : a) {
            if (b.contains(c))
                count++;
        }
        return count;
    }
}