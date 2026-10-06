class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length, l = 0;
        while (l < r) {
            int m = l + ((r - l) / 2);
            if(nums[m] == target){
                return m;
            }
            if (nums[m] > target) {
                r = m;
            }
            else {
                l = m +1;
            }
        }
        return -1;
    }
}

// if 3
