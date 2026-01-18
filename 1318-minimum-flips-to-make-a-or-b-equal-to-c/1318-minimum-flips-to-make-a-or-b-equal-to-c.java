class Solution {

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary.reverse().toString();
    }

    private String padLeft(String s, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i < len; i++) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }

    public int minFlips(int a, int b, int c) {
        String one = decimalToBinary(a);
        String two = decimalToBinary(b);
        String three = decimalToBinary(c);
        String res = decimalToBinary(a | b);

        int maxLen = Math.max(
            Math.max(one.length(), two.length()),
            Math.max(three.length(), res.length())
        );

        one = padLeft(one, maxLen);
        two = padLeft(two, maxLen);
        three = padLeft(three, maxLen);
        res = padLeft(res, maxLen);

        int count = 0;

        for (int i = 0; i < maxLen; i++) {
            if (three.charAt(i) != res.charAt(i)) {
                if (three.charAt(i) == '0') {
                    if (one.charAt(i) == '1') count++;
                    if (two.charAt(i) == '1') count++;
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}
