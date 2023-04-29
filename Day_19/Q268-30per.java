class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int min = nums[nums.length - 1];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (min != nums[i]) {
                return min;
            }
            min--;
        }
        if (min == 0) {
            return 0;
        }
        return nums.length;
    }
}