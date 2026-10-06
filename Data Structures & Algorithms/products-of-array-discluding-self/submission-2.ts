class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums: number[]): number[] {
        /**
         * [2, 3, 4, 5]
           [60, 40, 30, 24]
         * 
         * prefrix: [1, 2, 6, 24]
         * postfix: [60, 20, 5, 1] 
         * 
         * 
         */

        let prefix = new Array<number>(nums.length).fill(1);
        let postfix = new Array<number>(nums.length).fill(1);
        
        let j = nums.length - 1;
        let i = 0;
        while( i < nums.length - 1){
          prefix[i+1] *= prefix[i] * nums[i];
          postfix[j-1] = postfix[j] * nums[j];
          i++;
          j--;
        }
        let results: number[] = [];
        for(let numIndex = 0 ; numIndex < nums.length; numIndex++){
          results.push(prefix[numIndex] * postfix[numIndex]);
        }
        return results;
    }
}
