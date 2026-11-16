class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int Leftsum = 0;
        int rightSum = 0;
        for (int i = 0;i<n;i++){
            if (Leftsum<0){
                Leftsum = 0;
            }
            if (rightSum<0){
                rightSum = 0;
            }
            Leftsum += nums[i];
            rightSum += nums[n-i-1];
            max = Math.max(max,Math.max(Leftsum,rightSum));
        }
        return max;
    }
}
