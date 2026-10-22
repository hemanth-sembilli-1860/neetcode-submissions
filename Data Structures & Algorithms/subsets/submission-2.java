class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        int n = nums.length;
        solve(n,nums,0,in,list);
        return list;
    }
    public static void solve(int n,int nums[],int i,List<Integer> in,List<List<Integer>> list){
        list.add(new ArrayList<>(in));
        for (int j = i;j<n;j++){
            in.add(nums[j]);
            solve(n,nums,j+1,in,list);
            in.remove(in.size()-1);
        }
    }
}
