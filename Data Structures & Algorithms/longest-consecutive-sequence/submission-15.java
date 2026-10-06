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

        /*
        while i< length
        i
        look for i + 1
        if it exists add i and i + 1 to the list
            continue looking for the next one

        if it doesn't exist check if the curr is the longest and update if needed
        else start looking for the next number
        */
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

        System.out.println();

        return longestChain;
    }
}
