class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            c[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            c[k++] = nums2[i];
        }
        Arrays.sort(c);
        int n = c.length;
        if (n % 2 != 0) {
            return (double) c[n / 2];
        } else {
            int middle1 = c[(n / 2) - 1];
            int middle2 = c[n / 2];
            return (double) (middle1 + middle2) / 2.0;
        }
    }
}