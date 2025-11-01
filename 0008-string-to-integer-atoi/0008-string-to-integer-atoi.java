class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        return helper(s, i, sign, 0L);
    }

    private int helper(String s, int i, int sign, long num) {
       
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int)(sign * num);
        }

        int digit = s.charAt(i) - '0';
        num = num * 10 + digit;

      
        if (sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        
        return helper(s, i + 1, sign, num);
    }
}
