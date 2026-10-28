class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        int n = nums.length;
        solve(res,in,0,n,nums);
        return res;
    }
    public static void solve(List<List<Integer>> res,List<Integer> in,int i,int n,int nums[]){
        res.add(new ArrayList<>(in));
        for (int j = i;j<n;j++){
            in.add(nums[j]);
            solve(res,in,j+1,n,nums);
            in.remove(in.size()-1);
        }
    }
}
