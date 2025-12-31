class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count = 1;
        int open = intervals[0][0];
        int close = intervals[0][1];
        
        for ( int i = 1 ; i < intervals.length ; i++){
           int curopen = intervals[i][0];
           int curclose = intervals[i][1];
           if(curopen <= open && curclose >= close){
                open = intervals[i][0];
                close = intervals[i][1];
           }
           else if( !(open <= curopen &&  curclose <= close)){
            count++;
            open = intervals[i][0];
            close = intervals[i][1];
           }
           
        }
        return count;
    }
}