class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0)return;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[x] = nums[i];
                x++;
            }
        }
        for (int i = x; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}