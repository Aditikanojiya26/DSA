class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2; 
        long odd  = n / 2;       

        long ans = (power(5, even, 1) * power(4, odd, 1)) % MOD;
        return (int) ans;
    }

    public long power(long x, long n, long ans) {
        if (n == 0) return ans;
        if (n % 2 == 1)
            return power(x % MOD, n - 1, (ans * (x % MOD)) % MOD);
        else
            return power((x * x) % MOD, n / 2, ans);
    }
}
