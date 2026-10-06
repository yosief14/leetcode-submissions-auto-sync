class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0;
        int maxSubstring = 0;
        int maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            count.merge(c, 1, Integer::sum);
            maxFreq = Math.max(maxFreq, count.get(c));
            while ((r - l + 1) - maxFreq > k) {
                count.merge(s.charAt(l), -1, Integer::sum);
                l++;
            }
            maxSubstring = Math.max(maxSubstring, r - l + 1);
        }
        return maxSubstring;
    }

}
