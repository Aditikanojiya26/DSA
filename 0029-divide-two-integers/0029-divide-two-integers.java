class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        int count = 0;
        boolean flag = true;
        
        if( divisor < 0 &&  dividend < 0) flag = true;
        else if (divisor < 0 ||  dividend < 0)flag=false;
        // if( divisor < 0) divisor = -(divisor);
        // if( dividend < 0) dividend = -(dividend);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while(a >= b){
            long pow = 1;
            while( a >= b * (pow*2)) pow*=2;
            count+=pow;
            a -= b*pow;
        }
        return flag ? count : -count ;
    }
}