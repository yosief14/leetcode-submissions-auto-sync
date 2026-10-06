class Solution {
    public int scoreOfString(String s) {
        int length = s.length();
        int i = 1;
        int res = 0;
        while (i < length) {
            res += Math.abs((int) s.charAt(i) - (int) s.charAt(i - 1));
            i++;
        }
        return res;
    }
}
