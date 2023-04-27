class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int low = i + 1;
                int high = nums.length - 1;

                while (high > low) {
                    if (nums[high] + nums[low] == 0 - nums[i]) {
                        arr.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (nums[low] < nums[high] && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;

                    } else if ((nums[high] + nums[low]) < 0 - nums[i]) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }

        }
        return arr;
    }
}