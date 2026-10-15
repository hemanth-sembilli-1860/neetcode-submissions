class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int c = 0;
        for (String s:details){
            int h = Integer.parseInt(s.substring(11,13));
            if (h>60){
                c++;
            }
        }
        return c;
    }
}