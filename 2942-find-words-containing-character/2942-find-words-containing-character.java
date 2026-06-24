class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = 0;
        String m=String.valueOf(x);
        List<Integer> list = new ArrayList<>();
        for (String s : words) {
            if(s.contains(m)) {
                list.add(n);
            
            }
            n++;
        }
        return list;
    }
}