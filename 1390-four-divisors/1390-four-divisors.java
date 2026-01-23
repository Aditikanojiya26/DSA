class Solution {

    private int divisorsSum(int n) {
        int count = 0;
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                count++;
                sum += d1;

                if (d1 != d2) {
                    count++;
                    sum += d2;
                }

                if (count > 4) return 0;
            }
        }
        return count == 4 ? sum : 0;
    }

    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans += divisorsSum(x);
        }
        return ans;
    }
}
