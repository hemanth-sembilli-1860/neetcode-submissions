class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        solve(nums,n,0,list,res);
        return res;
    }
    public static void solve(int nums[],int n,int i,List<Integer> list,List<List<Integer>> res){
        if (i == n){
            res.add(new ArrayList<>(list));
            return;
        }
        solve(nums,n,i+1,list,res);
        list.add(nums[i]);
        solve(nums,n,i+1,list,res);
        list.remove(list.size()-1);
    }
}
