class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Edge case: Since array elements are strictly positive, 
        // if k is 0 or 1, no product can be strictly less than k.
        if (k <= 1) return 0; 
        
        int count = 0;
        long pr = 1;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            pr *= nums[right];
            
            // If product is too big, shrink the window from the left
            while (pr >= k) {
                pr /= nums[left];
                left++;
            }
            
            // Add the number of valid subarrays ending at the 'right' pointer
            count += right - left + 1;
        }
        
        return count;
    }
}