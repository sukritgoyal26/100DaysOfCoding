class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k = k % n + 1;
        rev(nums, 0, n - k);
        rev(nums, n - k + 1, n);
        rev(nums, 0, n);

        System.gc();

    }

    public static void rev(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}