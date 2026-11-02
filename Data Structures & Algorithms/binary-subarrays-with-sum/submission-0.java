class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)-solve(nums,goal-1);
    }
    public static int solve(int nums[],int goal){
        if (goal<0){
            return 0;
        }
        int c = 0;
        int n = nums.length;
        int j = 0;
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum += nums[i];
            while (sum>goal){
                sum -= nums[j];
                j++;
            }
            c += i-j+1;
        }
        return c;
    }
}