class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int c[] = new int[k];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        for (int i = 0;i<k;i++){
            c[i] = pq.poll().getKey();
        }
        return c;
    }
}
