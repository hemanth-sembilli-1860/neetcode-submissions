class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        boolean used[] = new boolean[n];
        solve(res,list,used,n,nums);
        return res;
    }
    public static void solve(List<List<Integer>> res,List<Integer> list,boolean used[],int n,int nums[]){
        if (n == list.size()){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i<n;i++){
            if (used[i]) continue;
            list.add(nums[i]);
            used[i] = true;
            solve(res,list,used,n,nums);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
