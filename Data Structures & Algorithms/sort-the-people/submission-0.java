class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String s[] = new String[n];
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i = n-1;i>=0;i--){
            s[n-i-1] = map.get(heights[i]);
        }
        return s;
    }
}