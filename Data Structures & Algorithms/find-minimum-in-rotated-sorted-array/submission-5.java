class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length-1;

        while (l<=r){
            if (nums[l] < nums[r]){
                return Math.min(min, nums[l]);
            }
            
            int m = l + (r -l)/2;
            min = Math.min(min, nums[m]);
            if (nums[l] <= nums[m]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return min;
    }
}
