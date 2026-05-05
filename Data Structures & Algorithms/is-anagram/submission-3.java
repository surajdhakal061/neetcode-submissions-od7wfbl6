class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> scountMap= new HashMap<>();
        Map<Character,Integer> tcountMap= new HashMap<>();
        for(int i=0;i<s.length();i++){
            tcountMap.put(t.charAt(i),tcountMap.getOrDefault(t.charAt(i),0)+1);
            scountMap.put(s.charAt(i),scountMap.getOrDefault(s.charAt(i),0)+1);
        }
        if(scountMap.equals(tcountMap)) return true;
        return false;
    }
}
