class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] bitMap = new int[26];

        for (char task : tasks) {
            int index = task - 'A';
            bitMap[index]++;
        }
        Arrays.sort(bitMap);
        int maxCount = bitMap[25] -1 ;
        int maxIdleTime = maxCount * n;


        for (int i = 24 ; i>=0 ; i--){
            maxIdleTime -= Math.min(maxCount, bitMap[i]);
        } 

        return Math.max(0, maxIdleTime) + tasks.length;
        }
}
