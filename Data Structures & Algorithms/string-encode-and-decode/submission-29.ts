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
        let tokenLength= '';
        for (let i = 0 ; i < str.length; i+=0){
            const currChar = str[i];

            if (currChar === '#' && tokenLength.length > 0) {
                const startParsingIndex:number = i+1;
                const endParsingIndex:number = startParsingIndex + Number(tokenLength);
                const token:string = str.slice(startParsingIndex, endParsingIndex);
                results.push(token);
                tokenLength = '';
                i = endParsingIndex;
            }else{
                tokenLength += currChar;
                i++;
            }

        }
        return results;


    }

}
