class Solution {
    public int[] leftRightDifference(int[] nums) {
        if (nums.length == 1) {
            nums[0] = 0;
            return nums;
        }
        int lSum = 0;
        int rSum = 0;
        int res[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            rSum += nums[i];
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = Math.abs(lSum - rSum);
            lSum += nums[i];
            if (i + 1 != res.length) {
                rSum -= nums[i + 1];
            }
        }

        return res;

    }
}