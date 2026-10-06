class Solution {
    public int[] productExceptSelf(int[] nums) {

       int []  prefix = new int[nums.length];
       int []  postFix = new int[nums.length];
       
       Arrays.fill(prefix, 1);
       Arrays.fill(postFix, 1);

       for(int i = 1, j = nums.length - 2; i< nums.length; i++, j--){
           prefix[i] = prefix[i-1] * nums[i-1];  
           postFix[j] = postFix[j+1] * nums[j+1];  
       }; 

       int[] result = new int[nums.length];
        //[1,1,2,24]
        //[48,24,6,1]
       for (int i = 0; i < nums.length; i++){
        result[i] = prefix[i] * postFix[i];
       }
       
       return result;


       
    }
}  
