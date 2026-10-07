class Solution {
    record Coords(double delta, int index) {}
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Coords> minHeap =
            new PriorityQueue<>(Comparator.comparingDouble(Coords::delta).reversed());

        for (int i = 0; i < points.length; i++) {
            double delta = getDistance(points[i][0], points[i][1]);
            add(minHeap, delta, i, k);
        }

        int[][] res = new int[k][2];
        int i = 0;
        for (Coords entry : minHeap) {
            res[i] = points[entry.index];
            i++;
        }
        return res;
    }
    private double getDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private void add(PriorityQueue<Coords> minHeap, double delta, int index, int k) {
        minHeap.offer(new Coords(delta, index));
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }
}
/*
xi,yi

0^2 + 2



(delta, index)
k

1,2,3,4

3
[2,1]

*/