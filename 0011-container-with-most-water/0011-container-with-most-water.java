class Solution {
    public int maxArea(int[] height) {
        int MaxWater = 0;
        int left = 0;
        int right = height.length - 1;
     //   int minH = 0;
        while (left < right) {
            int minH = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minH * width;
            MaxWater = Math.max(MaxWater, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return MaxWater;
    }
}