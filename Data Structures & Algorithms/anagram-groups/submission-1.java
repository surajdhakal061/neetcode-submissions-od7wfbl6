class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>,List<String>> anaMap = new HashMap<>();
        for(String s: strs){
            Map<Character,Integer> count= new HashMap<>();
            for (char c : s.toCharArray()){
                count.put(c,count.getOrDefault(c,0)+1);
            }
                anaMap.putIfAbsent(count,new ArrayList<>());
                anaMap.get(count).add(s);
        }
        return new ArrayList<>(anaMap.values());
    }
}
