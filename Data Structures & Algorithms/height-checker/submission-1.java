class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int temp[] = Arrays.copyOf(heights,n);
        Arrays.sort(temp);
        int c = 0;
        for (int i = 0;i<n;i++){
            if (heights[i]!=temp[i]){
                c++;
            }
        }
        return c;
    }
}