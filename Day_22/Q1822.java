class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                neg++;
            }
        }
        if (neg != 0 && neg % 2 != 0) {
            return -1;
        } else {
            return 1;
        }

    }
}