class Solution {
    public int numberOfSubstrings(String s) {
        
    int n = s.length();
    int[] freq = new int[3]; // assuming only a,b,c
    int distinct = 0;
    int left = 0;
    int result = 0;

    for (int right = 0; right < n; right++) {
        int idx = s.charAt(right) - 'a';
        
        if (freq[idx] == 0) distinct++;
        freq[idx]++;

        // shrink until window has exactly all 3 chars
        while (distinct == 3) {
            // all substrings starting at left and ending at r, r+1 ... end are valid
            result += n - right;

            // remove left char
            int leftIdx = s.charAt(left) - 'a';
            freq[leftIdx]--;
            if (freq[leftIdx] == 0) distinct--;
            left++;
        }
    }
    return result;


    }
}