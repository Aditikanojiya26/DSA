class Solution {
    public int myAtoi(String s) {
       s = s.trim();
        if (s.isEmpty()) return 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i > 0 && !Character.isDigit(c)) break;
            else if (i == 0 && c == '-') sb.append(c);      
            else if (i == 0 && c == '+') continue;         
            else if (i == 0 && !Character.isDigit(c)) return 0;
            else if (c == '0' && (sb.length() == 0 || sb.toString().equals("-"))) continue; 
            else if (Character.isDigit(c)) sb.append(c);
            else break;
        }

       if (sb.length() == 0 || sb.toString().equals("-")) return 0;

       
        long num = 0;
        try {
            num = Long.parseLong(sb.toString());
        } catch (NumberFormatException e) {
            // handle overflow cases directly
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;   
    }
}