class Solution {
    public String triangleType(int[] nums) {
        String op = "";
        if (nums[0] + nums[1] <= nums[2] ||
            nums[0] + nums[2] <= nums[1] ||
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        }
        if (nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2]) {
            op = "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            op = "isosceles";
        } else if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
            op = "scalene";
        }
        
        return op;
    }
}