class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 , r = 0 , maxlength = 0 , len = s.length();
        int[] arr = new int[256];
        while( r < len ){
            char c = s.charAt(r);
            arr[c] += 1;
            while (arr[c] != 1){
                arr[ s.charAt(l) ] -= 1;
                l++;
            }
            maxlength= Math.max( maxlength , r-l+1 );
            r++;
        }
        return maxlength;
    }
}