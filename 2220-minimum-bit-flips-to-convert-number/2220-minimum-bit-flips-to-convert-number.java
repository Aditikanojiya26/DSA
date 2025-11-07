class Solution {
    public int minBitFlips(int start, int goal) {
        int digit=start^goal;
        String binary = Integer.toBinaryString(digit);
        int countOnes = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') countOnes++;
        }
        return countOnes;
    }
}