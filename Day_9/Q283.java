class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zerocount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zerocount++;
            }
        }
        if (zerocount > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
        } else if (zerocount == 1) {
            for(int i = 0 ; i< nums.length ; i++){
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            }
        } else {

            for (int i = 0; i < nums.length; i++) {
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}