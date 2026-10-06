class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numMap = new HashSet<>();

        for (int num : nums) {
            numMap.add(num);
        }

        int longestChain = 1;
        List<Integer> startNums = new ArrayList<>();

        for (int num: numMap){
           if(!numMap.contains(num-1)){
            startNums.add(num);
           } 
        }

        for (int num: startNums) {

            int currentChain = 1;
            int nextNum = num + 1;
            while (numMap.contains(nextNum)) {
                currentChain++;
                nextNum++;
            }

            System.out.println("currentChain: " + currentChain + ", nextNum: " + nextNum  );
            longestChain = Math.max(longestChain, currentChain);
        }
        return longestChain;
    }
}