class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int t=k;
        for (int i = 0; i < nums.length+1; i++) {
            if (!set.contains(k)) {
                return k;
            }
            else{
                k+=t;
            }
           
        }
        return t+t;
    }
}