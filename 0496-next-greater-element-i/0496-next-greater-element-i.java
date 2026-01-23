class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int[] result = new int[n2];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < n2 ; i++){
            while( !stack.isEmpty() && nums2[i]>nums2[stack.peek()]){
                int index = stack.pop();
                result[index] = nums2[i];
            }
            stack.push(i);
            map.put(nums2[i],i);
        }
        int n1 = nums1.length;
        int[] fresult = new int[n1];
        for( int i = 0 ; i < n1 ; i++){
            int index = map.get(nums1[i]);
            fresult[i] = result[index];
        }
        return fresult;
    }
}