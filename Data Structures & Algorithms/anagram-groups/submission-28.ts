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

        const bloomish_filter = new Map<string, string[]>();
        let result_list:  string[][] = [];

        for (let i = 0; i < strs.length; i++) {
            // check if val is an anagram of existing set
            const hash = hashAlgo(strs[i]);
              console.log(strs[i]);
               console.log(hash);
                  
            if (bloomish_filter.has(hash)) {
               
              console.log('bloom filter has it')

            
                bloomish_filter.get(hash).push(strs[i]);
            } else {
                bloomish_filter.set(hash, [strs[i]]);
            }

        }
        bloomish_filter.forEach((values) =>{
            result_list.push(values);
        })
     
        return result_list;

        function hashAlgo(key: string) {
            const hash = new Array<number>(26).fill(0);

            for (let i = 0; i < key.length; i++) {
                console.log(i);
                hash[key.charCodeAt(i) - 97] += 1;
            }
            return hash.join("#");
        }
    }
}
