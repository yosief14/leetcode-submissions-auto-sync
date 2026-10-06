class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {

        const s_bloom_filter= Array(26).fill(0);
        const t_bloom_filter= Array(26).fill(0);

        for (let i = 0; i < s.length; i++){
            s_bloom_filter[s.charCodeAt(i) - 97] +=1
        };
        for (let i = 0; i < t.length; i++){
            t_bloom_filter[t.charCodeAt(i) - 97] +=1
        };

        for (let i = 0; i < 26 ; i++){
            if (s_bloom_filter[i] !== t_bloom_filter[i]){
                return false
            }
        }
        return true;
    }
}
