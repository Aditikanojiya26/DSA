import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;  
        }
 
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                chars.add((char) i);
            }
        }
        Collections.sort(chars,(a, b) -> freq[b] - freq[a]);
        // chars.sort((a, b) -> freq[b] - freq[a]);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < freq[c]; i++) {
    sb.append(c);
}
        }

        return sb.toString();
    }
}