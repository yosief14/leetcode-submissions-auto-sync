class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
        1 pass
        last string = ""
        1st pass
         compare the current prefix string to the current string 1 char at a time

         if they match 
            don't do anything 
         if the don't match
            return substring of how  long it lasted

         last = concat initial chars that match

         
        */


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
