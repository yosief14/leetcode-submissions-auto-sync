class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs: string[]): string {
       return strs.map(str=>`${str.length}#${str}`).join('');
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

                const startIndex:number = i+ 1; 
                const endIndex:number = startIndex + Number(tokenLength);
                results.push(str.slice(startIndex, endIndex));
                i = endIndex;
            

        }
        return results;


    }

}
