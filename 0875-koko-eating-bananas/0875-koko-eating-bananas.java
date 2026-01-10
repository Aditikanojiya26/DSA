class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int n = piles.length;

        // Find max pile
        for (int i = 0; i < n; i++) {
            k = Math.max(k, piles[i]);
        }

        int ans = k;
        int low = 1, high = k;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += (piles[i] + mid - 1) / mid; 
            }

            if (sum <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
