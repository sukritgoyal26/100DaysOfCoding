class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length ==1){
            return nums[0];
        }
        for(int i = 1 ; i<nums.length-1;i=i+2){
            if(nums[i-1]!=nums[i]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}