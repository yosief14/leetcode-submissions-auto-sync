class KthLargest {
    private final PriorityQueue<Integer> minHeap;
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int num: nums) {
            add(num);
        }
    }

    public int add(int val) {

        if (minHeap.size() < k) {
            minHeap.offer(val);
        }else if (val > minHeap.peek()){
         minHeap.poll();
         minHeap.offer(val);
        }
        return minHeap.peek();
    }
}

/*

2nd 

1,2,3,4,5


*/