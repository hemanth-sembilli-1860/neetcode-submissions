class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String org = sb.toString();
        sb.reverse();
        return sb.toString().equals(org);
    }
}
