class Solution {
    public int divisors(int n) {
        int[] temp = new int[n]; 
        int count = 0; 
        int sqrtN = (int) Math.sqrt(n); 
        for(int i = 1; i <= sqrtN; i++) {
            if(n % i == 0) {
                temp[count++] = i;
                if(i != n / i) {
                    temp[count++] = n / i;
                }
            }
        }
        int sum = 0;
        if(count == 4){
            for(int i = 0 ; i < count ; i++) sum+=temp[i];
        }
        return sum;
    }
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int  i = 0 ; i < nums.length ; i++){
            sum += divisors(nums[i]);
        }
        return sum;
    }
}