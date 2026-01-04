class Solution {
    void findCombination(int ind , int[] candidates , int target ,List<List<Integer>> list ,List<Integer> ds ){
        if(ind == candidates.length){
            if(target == 0) list.add(new ArrayList<>(ds));
            return;
        }
        if(candidates[ind]<= target){
            ds.add(candidates[ind]);
            findCombination(ind,candidates ,target-candidates[ind],list,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(ind+1,candidates ,target,list,ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> list = new ArrayList<>();
       findCombination(0,candidates ,target,list,new ArrayList<>());
       return list;
    }
}