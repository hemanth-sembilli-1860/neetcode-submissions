class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int score = 0;
        for (int i = 0;i<n-1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            score += Math.abs((int)c1-(int)c2);
        }
        return score;
    }
}