class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || nums == null) {
            return 0;
        }
        int max_index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
            if (nums[max_index] < nums[i]) {
                max_index = i;
            }
        }
        if (nums[max_index] < nums[nums.length - 1]) {
            max_index = nums.length - 1;
        }
        return max_index;
    }
}