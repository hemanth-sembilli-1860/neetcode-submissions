class Solution {
    public int rob(int[] nums) {
        int houses = nums.length;
        if (houses == 0) return 0;
        if (houses == 1) return nums[0];
        if (houses == 2) return Math.max(nums[0],nums[1]);
        int loot[] = new int[houses+1];
        loot[0] = nums[0];
        loot[1] = Math.max(nums[0],nums[1]);
        for (int i = 2;i<houses;i++)
            loot[i] = Math.max(loot[i-1],nums[i]+loot[i-2]);
        return loot[houses-1];
    }
}
