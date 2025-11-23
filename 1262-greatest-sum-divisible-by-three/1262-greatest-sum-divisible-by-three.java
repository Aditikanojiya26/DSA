class Solution {
    boolean findandremove(int[] nums,int value){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==value) return true;
        }
        return false;
    }
    public int maxSumDivThree(int[] nums) {
       Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int sum=0;
        int n=nums.length;
        for(int i=0 ; i < n ; i++){
            sum+=nums[i];
        }
        int counter=sum/3;
        if(sum%3==0) return 3*counter;
        while( counter > 0 ){
            int value= sum - 3*counter;
            if(findandremove(nums,value)) return 3*counter;
            counter--;
        }
        return 0;
    }
}