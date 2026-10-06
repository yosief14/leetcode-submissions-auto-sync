class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums: number[], k: number): number[] {
        /**
         * for each number
         * 
         * 1. increment the count
         * 2. check if its still in the lead
         *  3.  update the lead state with count  
         *   
         */
        const counts: Record<number, number> = {};

        for (const num of nums ){
            counts[num] = (counts[num] ? counts[num] : 0) + 1;
        }
        const orderedCounts: number[][] = [];

        for(const[key, value] of Object.entries(counts)){
            if (orderedCounts[value]){
                orderedCounts[value].push(Number(key));
            }else{
            orderedCounts[value] = [Number(key)];
            }
        };
        console.log('counts: ', counts);
        console.log('orderedCounts: ', orderedCounts);
        const result = orderedCounts.flat();
        console.log('results: ', result);

        return result.slice(-k);
    }
}
