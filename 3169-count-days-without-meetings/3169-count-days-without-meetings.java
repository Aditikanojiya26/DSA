class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        int count=0;
        int prevOpen = meetings[0][0];
        int prevClose = meetings[0][1];
        if( prevOpen > 1) count += prevOpen-1;
        for(int i = 1 ; i < meetings.length ; i++){
            int currOpen = meetings[i][0];
            int curClose = meetings[i][1];
            if(prevClose < currOpen){
                count+= currOpen - prevClose - 1 ;
                prevOpen = currOpen;
                prevClose = curClose;
            } else{
                prevClose = Math.max(prevClose,curClose);
            }
        }
        if( prevClose < days) count += days - prevClose;
        return count;
    }
}