class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, 1);
        }

        int longestChain = 1;
        
        for (int i = 0; i < nums.length; i++) {
            int currentChain = 1;
            int nextNum = nums[i] + 1;
            boolean searching = true;

            while (numMap.containsKey(nextNum)) {
                currentChain++;
                nextNum++;
            }

            if (currentChain > longestChain) {
                longestChain = currentChain;
            }
        }
        return longestChain;
    }
}
