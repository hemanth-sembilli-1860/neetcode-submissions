class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<n;i++){
            char key = s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        while (!pq.isEmpty()){
            char ch = pq.poll();
            int val = map.get(ch);
            while (val-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}