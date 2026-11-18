class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int c = 0;
        int j = 0;
        for (int i = 0;i<n;i++){
            if (nums[i]!=val){
                c++;
                nums[j++] = nums[i];
            }
        }
        return c;
    }
}