class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        int count = 0;

        for (int i = 1; i < sums.length; i++) {
            sums[i]= sums[i-1]+nums[i];
        }

        for (int i = 0; i < sums.length; i++) {
            if (sums[i]==k) {
                count++;
            }
            for (int j = i+1; j < sums.length; j++) {
                if (sums[j]-sums[i] == k) {
                    count++;
                }
            }
        }
        return count ;

    }
}