class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        //I'm looking for the indeces of nums whos sum to the target number 
        // they must not be the same indces

        // itterate through nums target - number[i] = number to search for
        // if not found try next number
        let first_index = 0;
        let second_index = 0;
        for(let i = 0 ; i < nums.length ; i++){
            first_index = i
            const second_target = target - nums[i];

            for (let j = i + 1 ; j < nums.length ; j++){
                if (nums[j] === second_target ){
                    second_index = j;
                    return [first_index, second_index];
                }
            } 
        } 
        


    }
}
