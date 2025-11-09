

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void generate(int[] nums, int i, List<Integer> current, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(current)); 
            return;
        }

        current.add(nums[i]);
        generate(nums, i + 1, current, ans);

       
        current.remove(current.size() - 1);
        generate(nums, i + 1, current, ans);
    }
}
