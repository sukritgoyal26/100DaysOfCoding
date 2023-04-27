class Solution {
    public int removeElement(int[] nums, int val) {
        int  pointer = nums.length -1 ;
        int count = 0;
        for(int i = nums.length - 1 ; i>=0 ; i--){
            if(nums[i]==val){
                nums[i]=nums[pointer];
                pointer--;
                count--;
                
            }
            count++;
        }return count;
    }
}