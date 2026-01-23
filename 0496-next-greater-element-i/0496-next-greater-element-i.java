class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> next greater

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // remaining elements in stack have no next greater, default -1
        int[] fresult = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            fresult[i] = map.getOrDefault(nums1[i], -1);
        }

        return fresult;
    }
}
