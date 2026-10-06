class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (l <= r){
            int m = (l + r)/2 ;
            min = Math.min(min, nums[m]); 
            int left = nums[l];
            int right = nums[r];
            int mid = nums[m];

            //if mid is less than both the smaller exists to the left of it
            if( mid < right && mid < left ){
                r = m ;
            }
            // if its greater than both move in the direction of smaller pointer
            else if (mid > left && mid > right) {
                if(left < right ){
                    r = m;
                }else{
                    l = m+1;
                }
            }else if (right > mid){
                r = m;
            }else{
                l = m +1;
            }
        }

        return min;
    }
}

/*
length n sorted in ascending

find smallest num

how do i find where to put the pointers?

[3,4,5,6,1,2]
[]

l = 3
r = 2



[2,3,1]


*/