class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int Element = 0;
        for (int x : nums) {
            if (count == 0) {
                Element = x;
            }if (x == Element) {
                count++;
            } else {
                count--;
            }
        }
        return Element;
    }
}