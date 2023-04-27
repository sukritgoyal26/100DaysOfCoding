class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }

        int top = nums[0];
        int pos=1;

        for(int i  =1 ; i<nums.length ; i++){
            if(nums[i]!=top){
                nums[pos]=nums[i];
                top=nums[i];
                pos+=1;

            }
        }
        return pos;
    }
}