class Solution {
    public int numberOfSubstrings(String s) {
        
    int n = s.length();
    int[] freq = new int[3]; 
    int distinct = 0;
    int left = 0;
    int result = 0;

    for (int right = 0; right < n; right++) {
        int idx = s.charAt(right) - 'a';
        
        if (freq[idx] == 0) distinct++;
        freq[idx]++;

        while (distinct == 3) {
            result += n - right;
            int leftIdx = s.charAt(left) - 'a';
            freq[leftIdx]--;
            if (freq[leftIdx] == 0) distinct--;
            left++;
        }

    }
    return result;


    }
}