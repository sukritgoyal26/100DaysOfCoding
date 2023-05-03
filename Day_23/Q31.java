class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 1;

        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
            i--;
        }
        if (i == 0) {
            Arrays.sort(nums);
        } else {
            for (int j = n - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[j];
                    nums[j] = temp;
                    break;
                }

            }
            Arrays.sort(nums, i, n);
        }
    }
}