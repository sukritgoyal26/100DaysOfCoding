class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int arr[] = { -1, -1 };
        int location = -1;
        if (nums == null || nums.length == 0) {
            return arr;
        }
        while (high >= low) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                location = mid;
                low = mid;
                high = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        while (low != 0 && nums[low - 1] == target) {
            --low;
        }
        while (high != nums.length - 1 && nums[high + 1] == target) {
            ++high;
        }
        if (location == -1) {
            return arr;
        } else {
            arr[0] = low;
            arr[1] = high;
            return arr;
        }
    }
}