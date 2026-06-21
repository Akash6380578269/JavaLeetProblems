class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];
        int k = 0;
        int j = 0;
        int i = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                c[k++] = nums1[i++];
            } else {
                c[k++] = nums2[j++];
            }

        }
        while (j < nums2.length) {
            c[k++] = nums2[j++];
        }
        while (i < nums1.length) {
            c[k++] = nums1[i++];
        }
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