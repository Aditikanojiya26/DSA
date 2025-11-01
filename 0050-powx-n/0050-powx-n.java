class Solution {
    public double myPow(double x, int n) {
    long exp = n;
    if (exp < 0) return power(1/x, -exp, 1);
    return power(x, exp, 1);
}
    public double power(double x, long n, double ans) {
    if (n == 0) return ans;          
    if (n % 2 == 1)                 
        return power(x, n - 1, ans * x);
    else                             
        return power(x * x, n / 2, ans);
    }

}
