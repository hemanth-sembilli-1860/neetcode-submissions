class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int c = 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int prevEnd = intervals[0][1];
        for (int i = 1;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start>=prevEnd){
                prevEnd = end;
            }
            else {
                c++;
                prevEnd = Math.min(prevEnd,end);
            }
        }
        return c;
    }
}

//[1,2][1,4][2,4]