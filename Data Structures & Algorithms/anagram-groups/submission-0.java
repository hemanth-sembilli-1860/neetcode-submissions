class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s:strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sp = new String(c);
            if (!map.containsKey(sp)){
                map.put(sp,new ArrayList<>());
            }
            map.get(sp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
