class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
    
        const s_word = s.split('').sort().join('');
        const t_word = t.split('').sort().join('');

        return s_word === t_word;

    }
}
