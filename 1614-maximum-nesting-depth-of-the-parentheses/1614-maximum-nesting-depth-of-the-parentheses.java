class Solution {
    public int maxDepth(String s) {
        int left=0 , right = 0 , maxCount=0;
        for(char ch : s.toCharArray()){
            if ( ch == '(' ){ 
                left++;
                maxCount=Math.max( maxCount , left-right );
            }
            else if ( ch == ')' ){
                right++;
            }
        }
        return maxCount;
    }
}