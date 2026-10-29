class Solution {
    public int[] findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i:nums){
            int idx = Math.abs(i)-1;
            if (nums[idx]>0){
                nums[idx] = -nums[idx];
            }
            else {
                res.add(Math.abs(i));
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
