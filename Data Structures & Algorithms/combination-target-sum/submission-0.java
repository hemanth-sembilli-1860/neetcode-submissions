class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        solve(n,nums,0,target,list,res);
        return res;
    }
    public static void solve(int n,int nums[],int i,int target,List<Integer> list,List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (i == n || target<0){
            return;
        }
        list.add(nums[i]);
        solve(n,nums,i,target-nums[i],list,res);
        list.remove(list.size()-1);
        solve(n,nums,i+1,target,list,res);
    }
}
