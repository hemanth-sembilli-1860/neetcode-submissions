class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int arr[] = new int[128];
        for (int i = 0;i<n;i++){
            Arrays.fill(arr,0);
            for (int j = i;j<n;j++){
                char ch = s.charAt(j);
                if (arr[ch] == 1){
                    break;
                }
                arr[ch]++;
                int len = j-i+1;
                maxLength = Math.max(maxLength,len);
            }
        }
        return maxLength;
    }
}
