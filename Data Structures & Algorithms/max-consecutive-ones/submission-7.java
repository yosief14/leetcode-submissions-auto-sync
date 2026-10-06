class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*
        iterate through array
        if 1 increment current count
        if its a 0
         if current max is < current then update max
         current = 0;
        */
        int max = 0;
        int count = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
            i++;
        }

        return Math.max(max, count) ;
    }
}