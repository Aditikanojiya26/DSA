class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        int count = 0;
        boolean flag1 = divisor < 0;
        boolean flag2 = dividend < 0;

        long a = Math.abs((long) dividend); //(long) dividend because prblm of −23^1
        long b = Math.abs((long) divisor);

        while(a >= b){
            long pow = 1;
            while( a >= b * (pow*2)) pow*=2;
            count+=pow;
            a -= b*pow;
        }
        return flag1 == flag2 ? count : -count ;
    }
}