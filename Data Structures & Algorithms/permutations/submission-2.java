class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        int n = nums.length;
        boolean b[] = new boolean[n];
        solve(res,in,n,nums,b);
        return res;
    }
    public static void solve(List<List<Integer>> res ,List<Integer> in,int n,int nums[],boolean b[]){
        if (in.size() == n){
            res.add(new ArrayList<>(in));
            return;
        }
        for (int i = 0;i<n;i++){
            if (b[i]) continue;
            in.add(nums[i]);
            b[i] = true;
            solve(res,in,n,nums,b);
            in.remove(in.size()-1);
            b[i] = false;
        }
    }
}
