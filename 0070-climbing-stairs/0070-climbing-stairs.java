class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        // Create an array to store the answer for every step up to n
        int[] dp = new int[n + 1];

        // We know the answer for step 0 and 1 (Base Cases)
        dp[0] = 1;
        dp[1] = 1;

        // Fill the "table" from step 2 up to n
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The answer for n is now stored in the last slot
        return dp[n];
    }
}
