class Solution {
    public int trap(int[] height) {
       int [] prefix = new int[height.length]; 
       int [] postfix = new int[height.length]; 
       int leftMax = 0;
       int rightMax =0;
       int reverseI = height.length -1;
       int res = 0;
       
       for(int i = 0 ; i< height.length; i++){
        rightMax = Math.max(height[reverseI-i],  rightMax);
        leftMax = Math.max(height[i], leftMax);
        prefix[i] = leftMax;
        postfix[reverseI - i] = rightMax;
       }
       postfix[height.length-1] = 0;
       prefix[0] = 0;
       
       for (int i = 0 ; i < height.length; i++){
        int resToAdd = Math.min(prefix[i], postfix[i]) - height[i]; 
        res += Math.max(resToAdd, 0);
       }
       
       
       return res; 
    }
}
