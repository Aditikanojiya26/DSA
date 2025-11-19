class Solution {
    boolean check(int[] nums , int key){
        for(int i =0 ; i< nums.length ;i++){
            if(nums[i]== key) return true;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        boolean flag=true;
        while(flag){
            if(check(nums,original)) original*=2;
            else break;
        }
        return original;
    }
}