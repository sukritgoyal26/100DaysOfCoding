class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1, min = Integer.MIN_VALUE, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == min) {
                count++;
                min = nums[i];
            } else if (nums[i] != min) {
                count = 1;
                min = nums[i];
            }
            longest = Integer.max(longest, count);
        }
        return longest;
    }
}