class Solution {
    
    public int findMin(int[] nums) {
      int ans = Integer.MAX_VALUE , l=0 , r = nums.length - 1 , mid =0;
      while( r >= l){
        mid = l + ( r - l ) / 2 ;
        if(nums[l]<nums[r]){
             ans = Math.min(nums[l],ans);
             break;
        }
        ans = Math.min(nums[mid],ans);
        if( nums[mid] >= nums[l]){
            l = mid+1;
        }else 
            r = mid - 1;
      }
      return ans ;
    }
}