class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target == nums[m]) {
                return m;
            }

            if (nums[l] <= nums[m]) {
                if (nums[l] > target || target > nums[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target < nums[m] || target > nums[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}

/*
given sorted indexj of target

3 2

1
m = 5

if num[m] > target

does num[m] = target
return

if target < num[m] I need to look for smaller
    if num[l] < num[r]
    check left
    else check right
else I need larger
    if num[l] < num[r]
    check right
    else check left

else I need to look for larger

if the target > mid

I need to look for higher

if left pointer is larger than the target that means the numbers that follow it are larger than the



*/