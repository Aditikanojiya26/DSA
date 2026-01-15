class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency count
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // unique elements
        List<Integer> list = new ArrayList<>(map.keySet());

        // sort by frequency (ascending)
        list.sort((a, b) -> {
    if (map.get(a).equals(map.get(b))) {
        return b - a;   // sort by key if frequency same
    }
    return map.get(a) - map.get(b); // sort by frequency
});

        int[] result = new int[nums.length];
        int index = 0;

        // rebuild array using frequency
        for (int num : list) {
            int freq = map.get(num);
            while (freq-- > 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
