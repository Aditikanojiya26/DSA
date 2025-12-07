class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n = nums.length;
        int count=0;
        for ( int i = 0 ; i < n ; i++){
            if( (nums[i] & 1) != 1 ){
                count++;
                if(count == 2) return true;
            }
        }
        return false;
    }
}