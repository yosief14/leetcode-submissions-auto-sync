class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> seen = new HashMap<>();
        int l = 0, r = 0;
        int maxSubString = 0;

        while ( r < s.length()) {
            char c = s.charAt(r);
            if (seen.containsKey(c)) {
                l = Math.max(seen.get(c) + 1, l);
            }
            seen.put(c, r);
            maxSubString = Math.max(maxSubString, r-l +1);
            r++;
        }
        // System.out.println( maxSubString);
        return maxSubString;
    }
}
