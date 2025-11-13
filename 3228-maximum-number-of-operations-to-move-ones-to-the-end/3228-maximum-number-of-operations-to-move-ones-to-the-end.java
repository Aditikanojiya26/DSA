class Solution {
    public int maxOperations(String s) {
        long ones = 0;
        long operations = 0;
        boolean inZeroBlock = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '1') {
                ones++;
                inZeroBlock = false; // reset, because zero-block ends
            } else { // c == '0'
                // if this is the start of a new zero-block after seeing 1s
                if (!inZeroBlock && ones > 0) {
                    operations += ones;
                    inZeroBlock = true;
                }
            }
        }

        return (int)operations;
    }
}
