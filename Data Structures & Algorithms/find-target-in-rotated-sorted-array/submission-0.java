class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0; 
        int right = nums.length-1;

        while( left<right){
            int mid = left + (right-left)/2;

            if(nums[mid]>nums[right])
                left = mid + 1;

            else
                right = mid;
        }

        int pivot = left;
        int l = 0; int r = nums.length-1;
        if(target>=nums[pivot] && target <= nums[r] ){
            l = pivot;
        }
        else{
            r = pivot-1;
        }

        while( l<=r){
            int m = (l+r)/2;
            if( nums[m]==target){
                return m ;
            }
            else if(nums[m]<target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return -1;
        
    }
}
