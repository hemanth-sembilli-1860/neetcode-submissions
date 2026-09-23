class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        boolean added[] = new boolean[n+1];
        List<Integer> list = new ArrayList<>();
        solve(nums,n,res,list,added);
        return res;
    }
    public static void solve(int nums[],int n,List<List<Integer>> res,List<Integer> list,boolean added[]){
        if (list.size() == n){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i<n;i++){
            if (added[i]){
                continue;
            }
            else {
                list.add(nums[i]);
                added[i] = true;
                solve(nums,n,res,list,added);
                added[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
