class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.isEmpty()){
            return false;
        }       
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int first=0;
        int  second = s.length()-1;
        while(first<second){
            if(s.charAt(first)!=s.charAt(second)){
                return false;
            }
            first++;
            second--;
        }

        return true;
    }
}
