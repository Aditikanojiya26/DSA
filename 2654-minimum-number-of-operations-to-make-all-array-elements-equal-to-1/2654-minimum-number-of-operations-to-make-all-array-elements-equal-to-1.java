class Solution {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int minOperations(int[] nums) {
        int n= nums.length;
        int count = 0;
        for( int i = 0 ; i < n ; i++){
            if( nums[i] == 1) count++;
        }
        if( count > 0 ) return n - count;
        int smSbLn=Integer.MAX_VALUE;
        for(int i =0 ; i < n-1 ; i++){
            int value=nums[i];
            for ( int j = i+1 ; j < n ; j++){
                value=gcd(value,nums[j]);
                if (value == 1 ) {
                    smSbLn = Math.min(smSbLn, (j - i + 1)); 
                    break; 
                }
            }
        }
        if(smSbLn!=Integer.MAX_VALUE) return smSbLn+n-2;
        return -1;
    }
}