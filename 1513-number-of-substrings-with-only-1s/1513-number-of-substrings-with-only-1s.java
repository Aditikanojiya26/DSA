class Solution {
    public int numSub(String s) {
        long result = 0;
        long count = 0;  
        int MOD = 1000000007;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count++;   
            } else {
                result = (result + (count * (count + 1) / 2) % MOD) % MOD;
                count = 0;
            }
        }
        result = (result + (count * (count + 1) / 2) % MOD) % MOD;
        return (int) result;
    }
}
