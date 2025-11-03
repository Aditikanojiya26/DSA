class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] temp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
        }
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || (i == j)){
                    result.get(i).add(1);
                }else{
                    result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }            
            }
        }
        return result;
    }
}