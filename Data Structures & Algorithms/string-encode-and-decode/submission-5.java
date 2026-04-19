class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int r=0;
        while(r<str.length()){
            int l=r;
            while(str.charAt(l)!='#'){
                l++;
            }
            int len = Integer.parseInt(str.substring(r,l));
            r=l+len+1;
            result.add(str.substring(l+1,r));
        }
        return result; 
    }
}
