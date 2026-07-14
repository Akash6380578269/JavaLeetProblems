class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
         Set<Integer> setf = new HashSet<>();
           Set<Integer> setf2 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            set2.add(x);
        }
        for (int x : nums1) {
            if (!set2.contains(x)) {
                setf.add(x);
            }
        }
          for (int x : nums2) {
            if (!set1.contains(x)) {
                setf2.add(x);
            }
        }
     for(int x : setf){
        l.add(x);
     }
     for(int x : setf2){
        l1.add(x);
     }
        ans.add(l);
        ans.add(l1);

        return ans;
    }
}