class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numMap = new HashSet<>();

        for (int num : nums) {
            numMap.add(num);
        }

            System.out.println("numMap: " + numMap);
        int longestChain = 1;

        for (int num: numMap) {

            int currentChain = 1;
            if (numMap.contains(num - 1)){
                continue;
            }

            int nextNum = num + 1;
            while (numMap.contains(nextNum)) {
                currentChain++;
                nextNum++;
            }

            System.out.println("currentChain: " + currentChain + ", nextNum: " + nextNum  );

            if (currentChain > longestChain) {
                longestChain = currentChain;
            }
        }
        return longestChain;
    }
}