class MedianFinder {
    private double median = 0;
    private List<Integer> nums;
    private PriorityQueue<Integer> leftHeap;
    private PriorityQueue<Integer> rightHeap;
    public MedianFinder() {
        nums = new ArrayList<>();
        leftHeap = new PriorityQueue<>(Comparator.reverseOrder());
        rightHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        nums.add(num);
        if (nums.size() == 1) {
            median = num;
        }
        addToHeap(num);
        setMedian();
    }

    public double findMedian() {
        return median;
    }

    private void addToHeap(int num) {
        PriorityQueue targetHeap;
        if (nums.size() == 1) {
            leftHeap.offer(num);
            rightHeap.offer(num);
            return;
        } else if (nums.size() == 2) {
            targetHeap = leftHeap.peek() < num ? rightHeap : leftHeap;
            targetHeap.poll();
            targetHeap.offer(num);
            return;
        }
        if ((double) num > median) {
            rightHeap.offer(num);
        } else {
            leftHeap.offer(num);
        }

        if(Math.abs(leftHeap.size()-rightHeap.size()) >1 ){
            resizeHeaps();
        }
    }
    private void resizeHeaps(){
       PriorityQueue targetHeap  = leftHeap.size() > rightHeap.size() ? leftHeap: rightHeap ;
       PriorityQueue addingHeap  = leftHeap.size() < rightHeap.size() ? leftHeap: rightHeap ;
       addingHeap.offer(targetHeap.poll());
    };

    private void setMedian() {
        if (nums.size() % 2 == 1) {
            median = leftHeap.size() > rightHeap.size() ? leftHeap.peek(): rightHeap.peek();
        } else {
            median = (double)(rightHeap.peek() + leftHeap.peek()) / 2;
        }
    }

}

/*
should I keep heaps even?

median = 4
num=1
if sizes are 0
split right gets smaller left gets larger
[][] -> [1][4]

if the same size median = peek() of both and divide by 2

if sizes are the same add jsut num to the left or right
median = 2.5
2
[1][4] -> [2,1][4]

median = 6
9
[4][8,9]



[4,1][8]

after adding if sizes are different median = peek of larger heap.

does this scale?

median = 8
10
[4][8,9,10]



if abs(heapsize2 - size2) < 1












*/