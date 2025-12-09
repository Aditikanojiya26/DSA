class Solution {
    long atMostKDistinct(String s, int K) {
    int n = s.length();
    int[] freq = new int[256];
    int distinct = 0, left = 0;
    long count = 0;

    for (int right = 0; right < n; right++) {
        if (freq[s.charAt(right)] == 0) distinct++;
        freq[s.charAt(right)]++;

        while (distinct > K) {
            freq[s.charAt(left)]--;
            if (freq[s.charAt(left)] == 0) distinct--;
            left++;
        }

        count += right - left + 1;
    }
    return count;
}

    public int numberOfSubstrings(String s) {
        
        long total = (long)s.length() * (s.length() + 1) / 2;
    long atMost2 = atMostKDistinct(s, 2);
    return (int)total - (int)atMost2;
    }
}