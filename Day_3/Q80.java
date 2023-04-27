class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }

        int top = nums[0];
        int pos=1;
        int count = 0;
        boolean flag = true ;

        for(int i  =1 ; i<nums.length ; i++){
            if(nums[i]!=top ){
                flag = true;
                nums[pos]=nums[i];
                top=nums[i];
                pos+=1;
            }
            else if(nums[i]==top && flag != false){
                nums[pos]=nums[i];
                pos+=1;
                flag = false;
            }

        }
        return pos;
    }
}