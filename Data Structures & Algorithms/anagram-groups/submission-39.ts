class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
        /**
         * 1. Take in the string
         * 2. store chars
         */

        const bloomish_filter: Record<string, string[]> = {};
        let result_list:  string[][] = [];

        for (let i = 0; i < strs.length; i++) {
            // check if val is an anagram of existing set
            const hash = this.hashAlgo(strs[i]);
            if (bloomish_filter[hash]) {                      
                bloomish_filter[hash].push(strs[i]);
            } else {
                bloomish_filter[hash] = [].concat(strs[i]);
            }

        }

   
        return Object.values(bloomish_filter)


    }
      private hashAlgo(key: string) {
            const hash = new Array<number>(26).fill(0);

            for (let i = 0; i < key.length; i++) {
                hash[key.charCodeAt(i) - 97] += 1;
            }
            return hash.join();
        }
}
