class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sumarr[i] = nums[i];
            } else {
                sumarr[i] = sumarr[i - 1] + nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int lsum = sumarr[i] - nums[i];
            int rsum = sumarr[sumarr.length - 1] - sumarr[i];
            if (lsum == rsum) {
                return i;
            }
        }
        return -1;
    }
}