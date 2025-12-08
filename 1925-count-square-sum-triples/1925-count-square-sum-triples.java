class Solution {
    public int countTriples(int n) {
        int count=0;
        for( int i = 1 ; i <= n ; i++){
            if(i%5==0) count+=2;
        }
        return count;
    }
}