class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        return freq.entrySet()
        .stream()
        .sorted((a,b)-> b.getValue()-a.getValue())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
