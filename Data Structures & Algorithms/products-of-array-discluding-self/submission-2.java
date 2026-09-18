class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int c[] = new int[n];
        c[0] = 1;
        for (int i = 1;i<n;i++){
            c[i] = c[i-1]*nums[i-1];
        }
        int suffix = 1;
        for (int i = n-1;i>=0;i--){
            c[i] *= suffix;
            suffix *= nums[i];
        }
        return c;
    }
}  
