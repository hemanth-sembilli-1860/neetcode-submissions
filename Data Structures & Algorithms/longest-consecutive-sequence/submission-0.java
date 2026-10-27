class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int best = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        for (int i = 0;i<n;i++){
            int num = nums[i];
            if (!set.contains(num-1)){
                int currentStk = 1;
                int currentNum = num;
            while (set.contains(currentNum+1)){
                currentStk++;
                currentNum++;
            }
            best = Math.max(best,currentStk);
            }
        }
        return best;
    }
}
