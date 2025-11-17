class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n =0,prev=0;
        for(int i=0 ;i < nums.length ;i++){
            if(nums[i]==1) {
                prev=i;
                break;
            }
        }
        for(int i=prev+1 ;i < nums.length ; i++){
            if(nums[i]==1){
                System.out.println(prev);
                System.out.println(i);
                System.out.println(i-prev);
                if(i-prev < k+1) return false;
                System.out.println(prev);
                prev=i;
            };
        }
        return true;
    }
}