class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numMap = new HashSet<>();

        for (int num : nums) {
            numMap.add(num);
        }

        int longestChain = 0;
        for (int num: numMap) {

            if (!numMap.contains(num - 1)){

            int currentChain = 1;
            while (numMap.contains( num + currentChain)) {
                currentChain++;
            }

            longestChain = Math.max(longestChain, currentChain);

            }

        }
        return longestChain;
    }
}