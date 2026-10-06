class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        let complements = new Map<number, number>();

        /**
         * Store all the compliments in a map
         *
         * key= compliment
         * value = index
         * n complexity
         * n memory
         */

        for (let i = 0; i < nums.length; i++) {
            const complement = target - nums[i];

            if (complements[nums[i]] >= 0 ) {
                return [i, complements[nums[i]]];
            }
            complements[complement] = i;
        }
    }
}
