class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs: string[]): string {
       let results = "";
       for (const str of strs){
          results +=  str.length + '#' + str
       } 
       console.log(results);
       return results;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str: string): string[] {
        let results:  string[] = [];
        let i = 0;
        while ( i < str.length){
            let tokenLength = '';
            while( str[i] !=='#' ){
                tokenLength += str[i]
                i++;
            }
            let hashIndex = i;

                const startIndex:number = hashIndex + 1;
                const endIndex:number = startIndex + Number(tokenLength);
                console.log({startIndex, endIndex});
                results.push(str.slice(startIndex, endIndex));
                tokenLength = '';
                i = endIndex;
            

        }
        return results;


    }

}
