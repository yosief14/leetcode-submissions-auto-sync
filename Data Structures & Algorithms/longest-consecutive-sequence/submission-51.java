class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numMap = new HashSet<>();

        for (int num : nums) {
            numMap.add(num);
        }

        int longestChain = 1;
        for (int num: numMap) {

            if (!numMap.contains(num - 1)){

            int currentChain = 1;
            while (numMap.contains( num + currentChain)) {
                currentChain++;
            }

            longestChain = Math.max(longestChain, currentChain);
            }

            // System.out.println("currentChain: " + currentChain + ", nextNum: " + nextNum  );
        }
        return longestChain;
    }
}