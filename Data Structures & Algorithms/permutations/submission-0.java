class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean used[] = new boolean[n];
        List<Integer> list = new ArrayList<>();
        solve(nums,n,list,res,used);
        return res;
    }
    public static void solve(int nums[],int n,List<Integer> list,List<List<Integer>> res,boolean used[]){
        if (list.size() == n){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i<n;i++){
            if (!used[i]){
                list.add(nums[i]);
                used[i] = true;
                solve(nums,n,list,res,used);
                used[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
