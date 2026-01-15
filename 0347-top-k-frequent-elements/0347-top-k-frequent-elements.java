class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // 1. Count frequencies
        for (int n : nums) { 
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Convert entries to a list for sorting
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        // 3. Sort by value descending (High frequency to Low)
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // 4. Extract the first K keys
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            // Get the key from the i-th entry in the sorted list
            arr[i] = list.get(i).getKey();
        }
        
        return arr;
    }
}