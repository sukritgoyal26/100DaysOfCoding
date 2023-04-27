class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> merge = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
        int x = intervals[0][0];
        int y = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= y) {
                y = Math.max(y, intervals[i][1]);
            }else{
                merge.add(new int[]{x,y});
                x = intervals[i][0];
                y=intervals[i][1];
            }
        }
        merge.add(new int[]{x,y});
        return merge.toArray(new int[0][]);
    }
}
        
    
