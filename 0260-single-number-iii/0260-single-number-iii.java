class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i < n-1 ; i++){
            if ((nums[i] ^ nums[i+1]) != 0)
                list.add(nums[i]);
            else 
                i++;
        }
        if(list.size()!=2) list.add(nums[n-1]);
        return new int[]{list.get(0),list.get(1)};
    }
}