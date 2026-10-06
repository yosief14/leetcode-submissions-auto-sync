class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        sort ()
        []

        2 3 4 5
        hash map

        list of numbers to check
        as we check the numbers keep track fo the longest chain
        return the longest chain
        add numbers to the hash map
        */
        if(nums.length == 0){
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

            while (searching) {
                if (numMap.containsKey(nextNum)) {
                    currentChain++;
                    nextNum++;
                } else {
                    searching = false;
                }
            }
            if (currentChain > longestChain) {
                longestChain = currentChain;
            }
        }
        return longestChain;
    }
}
