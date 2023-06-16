class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sorted[] = new int[nums.length];

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = nums[i];
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length; i++) {
            hm.putIfAbsent(sorted[i], i);
        }

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = hm.get(nums[i]);
        }

        return sorted;
    }
}