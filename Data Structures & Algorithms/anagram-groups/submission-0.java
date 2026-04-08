class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> maps = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char a : s.toCharArray()){
                count[a-'a']++;
            }
            String key = Arrays.toString(count);
            maps.putIfAbsent(key, new ArrayList<>());
            maps.get(key).add(s);
        }
        return new ArrayList<>(maps.values());
    }
}
