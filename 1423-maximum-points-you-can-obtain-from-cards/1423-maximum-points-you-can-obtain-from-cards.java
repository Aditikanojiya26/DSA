class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int l=k-1 , r = n-1 , lsum=0 , rsum=0 ;
        for (int i=0 ;i <= l ; i++) lsum += cardPoints[i];
        int maxSum = lsum;
        while( r >= n-k ){
            lsum -= cardPoints[l];
            rsum += cardPoints[r];
            maxSum = Math.max( maxSum , lsum + rsum );
            l--;
            r--;
        }
        return maxSum;

    }
}