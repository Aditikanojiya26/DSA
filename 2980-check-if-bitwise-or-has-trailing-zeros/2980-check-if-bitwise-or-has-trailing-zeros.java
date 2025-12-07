class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n = nums.length;
        int count=0;
        for ( int i : nums ){
            if( ( i & 1) != 1 ){
                count++;
            }
            if(count == 2) return true;
        }
        return false;
    }
}