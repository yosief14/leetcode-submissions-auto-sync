class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        let complements = new Map<number, number>();


        for (let i = 0; i < nums.length; i++) {
            const complement = target - nums[i];
            const num = nums[i];
            if (complements.has(num) ) {
                return [i, complements.get(num)];
            }
            complements.set(complement, i);
        }
    }
}
