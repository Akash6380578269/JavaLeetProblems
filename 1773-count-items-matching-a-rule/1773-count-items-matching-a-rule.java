class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rule = -1;
        if (ruleKey.equals("type")) {
            rule = 0;
        } else if (ruleKey.equals("color")) {
            rule = 1;
        } else {
            rule = 2;
        }
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(rule).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}