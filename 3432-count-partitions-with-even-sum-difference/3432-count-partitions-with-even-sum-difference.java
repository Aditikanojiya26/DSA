class Solution {
    public int countPartitions(int[] nums) {
        int lsum=nums[0],rsum=0,r=1,count=0;
        for(int i =1 ; i< nums.length ;i++) rsum+=nums[i];
        if((rsum-lsum)%2==0)count++;
        while(r<nums.length-1){
            lsum+=nums[r];
            rsum-=nums[r];
            if((rsum-lsum)%2==0)count++;
            r++;
        }
        return count;
    }
}