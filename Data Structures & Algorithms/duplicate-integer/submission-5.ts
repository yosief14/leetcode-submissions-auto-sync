class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        const x = new Set(nums);

        return x.size !== nums.length;
    }
}
