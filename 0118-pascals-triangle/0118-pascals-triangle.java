class Solution {
    public static List<List<Integer>> pascalTriangle(List<List<Integer>> list, int n) {
        
        if (n == 0) {
            list.add(Arrays.asList(1));
            return list;
        }

        
        pascalTriangle(list, n - 1);

        List<Integer> prev = list.get(list.size() - 1);
        List<Integer> curr = new ArrayList<>();

        
        curr.add(1);

        
        for (int i = 0; i < prev.size() - 1; i++) {
            curr.add(prev.get(i) + prev.get(i + 1));
        }

        
        curr.add(1);

        
        list.add(curr);

        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = pascalTriangle(new ArrayList<>(), numRows - 1);
        return result;
    }
}