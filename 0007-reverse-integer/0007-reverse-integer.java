class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        
        boolean isNegative = x < 0;
        if (isNegative) str = str.substring(1); 
        
      
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
       
        int num;
        try {
            num = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        
        if (isNegative) num = -num;
        return num;
    }
}
