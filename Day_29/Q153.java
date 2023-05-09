class Solution {
    public int findMin(int[] nums) {
                int low = 0; 
        int high = nums.length-1;
        int ans = nums[0];
        int mid =-1;
        while (low<=high) {
            if (nums[low] < nums[high]) {
                ans = Integer.min(ans,nums[low]);
                break;
            }
            mid = (high +low)/2;
            ans = Integer.min(ans, nums[mid]);
            if(nums[mid]>= nums[low]){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}