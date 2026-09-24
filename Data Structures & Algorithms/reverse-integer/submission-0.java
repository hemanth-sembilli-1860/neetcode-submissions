class Solution {
    public int reverse(int x) {
        int k = x;
        int rev = 0;
        while (k!=0){
           int dig = k%10;
           if ((rev>Integer.MAX_VALUE/10) || (rev==Integer.MAX_VALUE/10 && dig>7)){
            return 0;
           }
           if ((rev<Integer.MIN_VALUE/10) || (rev==Integer.MIN_VALUE/10 && dig<-8)){
            return 0;
           }
            rev = rev*10+dig;
            k = k/10;
        }
        return rev;
    }
}