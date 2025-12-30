class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {
            int open1 = firstList[i][0];
            int close1 = firstList[i][1];
            int open2 = secondList[j][0];
            int close2 = secondList[j][1];

            // Check intersection
            if (close1 >= open2 && close2 >= open1) {
                int open = Math.max(open1, open2);
                int close = Math.min(close1, close2);
                result.add(new int[]{open, close});
            }

            // Move the pointer which ends first
            if (close1 < close2) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
