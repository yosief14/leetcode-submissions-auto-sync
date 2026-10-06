class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        let compliments = new Map<number, number>();

        /**
         * Store all the compliments in a map
         *
         * key= compliment
         * value = index
         * n complexity
         * n memory
         */

        for (let i = 0; i < nums.length; i++) {
            compliments[nums[i]] = i;
        }
        console.log(compliments);
        for (let i = 0; i < nums.length; i++) {
            const compliment = target - nums[i];
            if (compliments[compliment] && compliments[compliment] != i) {
                return [i, compliments[compliment]];
            }
        }
    }
}
