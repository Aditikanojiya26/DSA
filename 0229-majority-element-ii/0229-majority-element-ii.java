class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list =new ArrayList<>();
        int can1=0,can2=0;
        int count1=0,count2=0;
        for(int i=0 ;i<n ; i++){
            if(nums[i]==can1) count1++;
            else if(nums[i]==can2) count2++;
            else if(count1==0){can1=nums[i];count1++;}
            else if(count2==0) {can2=nums[i];count2++;}
            else{
                count1--;
                count2--;
            }
        }
       count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == can1) count1++;
            else if (num == can2) count2++;
        }
        if (count1 > n / 3) list.add(can1);
        if (count2 > n / 3) list.add(can2);
        return list;
    }
}