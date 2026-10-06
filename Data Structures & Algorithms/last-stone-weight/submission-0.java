class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
       for(int stone: stones){
        maxHeap.offer(stone);
       }

       while(maxHeap.size() > 1){
        int y = maxHeap.poll(); 
        int x = maxHeap.poll(); 
        if(x<y){
            maxHeap.offer(y-x);
        }
       }

       return maxHeap.isEmpty()? 0: maxHeap.poll();
    }
}

/*
2 heaviest stones x and y 

if x==y both arer destroyed

if x<y 
destroy x 
y =x;

do this iteratively untill I get the weight of the last remaining stone

Add stones to PriorityQueue
*/