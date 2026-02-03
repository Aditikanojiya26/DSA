class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashMap map = new HashMap<>();
        for(int i = 1 ; i < n ; i++){
            int sum = nums[i] + nums[i-1];
            if(map.containsKey(sum)) return true;
            map.put(sum,i);
        }
        return false;
    }
}