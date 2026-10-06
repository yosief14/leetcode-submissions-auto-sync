class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0;
        int maxSubstring = 0;
        int maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            // count.merge(c, 1, Integer::sum);
            count.put(c, count.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, count.get(c));
            // While
            while ((r - l + 1) - maxFreq > k) {
                count.merge(s.charAt(l), -1, Integer::sum);
                // count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            maxSubstring = Math.max(maxSubstring, r - l + 1);
        }
        // System.out.println(maxSubstring);
        return maxSubstring;
    }

}
