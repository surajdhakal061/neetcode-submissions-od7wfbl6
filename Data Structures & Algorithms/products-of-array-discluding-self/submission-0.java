class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod= 1;
        int[] result= new int[nums.length];
        int noOfZeros = 0 ;
        for(int num : nums){
            if(num!=0){
                prod*=num;
            }else{
                noOfZeros++;
                if(noOfZeros>1){
                    return result;
                } 
                
            }
        }     

          
        for(int i=0;i<nums.length;i++){
            if(noOfZeros==1){
                result[i]=nums[i]==0?prod:0;
            }else{
                result[i]=prod/nums[i];
            }
        }

        return result;
    }
}  
