class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelset =  Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> vowel = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowelset.contains(c)) {
                vowel.add(c);
            }
        }
        Collections.sort(vowel);
       int index = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowelset.contains(c)) {
                sb.append(vowel.get(index++));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}