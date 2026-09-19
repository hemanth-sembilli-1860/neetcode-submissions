class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int n = nums.length;
        for (int i = 0;i<n;i++){
            if (left<0){
                left = 0;
            }
            left += nums[i];
            max = Math.max(max,left);
        }
        return max;
    }
}
