class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count=nums.length/3;
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int lcount=0;
            int candidate=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==candidate) lcount++;
            }
            if(lcount>count && !list.contains(nums[i])) list.add(nums[i]);
        }
        return list;
    }
}