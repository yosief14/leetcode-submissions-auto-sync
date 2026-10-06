class Solution {
    public boolean isSubsequence(String s, String t) {
        /*
        for each char in s
         look for that char in t
         When found update the index to start this loop over
         if not found return false

        */
        int j = 0;
        char target;
        for (int start = 0; start < s.length(); start++) {
            if (j == t.length()) {
                return false;
            }
            target = s.charAt(start);
            while (j < t.length()) {
                if (target == t.charAt(j)) {
                    System.out.println(target);
                    j++;
                    break;
                };
                j++;
            }
        }
        return true;
    }
}