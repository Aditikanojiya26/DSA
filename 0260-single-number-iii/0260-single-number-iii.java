class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                list.add(nums[i]);
                i++;
            } else {
                
                i += 2;
            }
        }
        return new int[]{list.get(0), list.get(1)};
    }
}
