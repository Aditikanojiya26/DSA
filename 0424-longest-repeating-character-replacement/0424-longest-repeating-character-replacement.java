class Solution {
    public int characterReplacement(String s, int k) {
        int l=0 , r=0 , maxLen = 0 , maxfreq = 0 ,n= s.length() ;
        int[] arr = new int[26];
        while( r < n ){
            arr[s.charAt(r)-'A']++;
            maxfreq = Math.max (maxfreq , arr[s.charAt(r)-'A']);
            while ( (r-l+1) - maxfreq > k ){
                arr[s.charAt(l)-'A']--;
                for( int i = 0 ; i < 26 ; i++) 
                    maxfreq = Math.max(maxfreq , arr[i]);
                l++;
            }
            maxLen = Math.max( maxLen , r-l+1);
            r++;
        }
        return maxLen;
    }
}