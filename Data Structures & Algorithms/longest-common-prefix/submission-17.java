class Solution {
    public String longestCommonPrefix(String[] strs) {

        String current = "";
        String prefix = strs[0];
        int prefixLength;
        int j;

        for (int i = 1; i < strs.length; i++) {
            current = strs[i];
            prefixLength = Math.min(prefix.length(), current.length());
            j = 0;
            while (j < prefixLength) {
                if (prefix.charAt(j) != current.charAt(j)) {
                    break;
                }
                j++;
            }

            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
