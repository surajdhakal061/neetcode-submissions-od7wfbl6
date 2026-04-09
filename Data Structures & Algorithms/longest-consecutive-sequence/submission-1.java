class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nonDup = new HashSet<>();
        for(int  num: nums){
            nonDup.add(num);
        }
        int max=0;
        for(int num:nonDup){
            if(nonDup.contains(num-1)){
                continue;
            }
            int count=0;
            while(nonDup.contains(num)){
                count++;
                num++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
