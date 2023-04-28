class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sums = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return sums;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                int low = j + 1;
                int high = nums.length - 1;
                long sum = 1L * target - 1L * nums[i] - 1L * nums[j];
                while (high > low) {
                    int insum = nums[low] + nums[high];
                    if (insum < sum) {
                        low++;
                    } else if (insum > sum) {
                        high--;

                    } else {
                        sums.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        int lowval = nums[low];
                        int highval = nums[high];
                        while (high > low && nums[high] == highval) {
                            --high;
                        }
                        while (low < high && nums[low] == lowval) {
                            ++low;
                        }
                    }
                }
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                    ++j;
                }
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
        return sums;

    }
}