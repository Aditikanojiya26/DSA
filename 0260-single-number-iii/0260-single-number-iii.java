class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0 ; i < n-1 ; i+=2){
            if ((nums[i] ^ nums[i+1]) != 0)
                return new int[]{nums[i], nums[i+1]};
        }
        return new int[]{0,0};
    }
}