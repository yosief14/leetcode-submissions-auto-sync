class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int minH = max;

        Stack<int[]> maxStack = new Stack();

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!maxStack.isEmpty() && maxStack.peek()[1] > heights[i]) {
                int top[] = maxStack.pop();
                int index = top[0];
                int height = top[1];
                max = Math.max(max, height * (i - index));
                start = index;
            }
            maxStack.push(new int[] {start, heights[i]});
        }
        System.out.println(maxStack.stream().map(Arrays::toString).toList());
        for (int[] pair : maxStack) {
            int index = pair[0];
            int height = pair[1];
            max = Math.max(max, height * (heights.length - index));
        }
        return max;
    }
}

/*
[7,1,7,2,2,4]
int max = heights[0]

iterate through heights

if number is smaller
 that means we can create a sub rectangle

[7,1,2,2,4]

1,3

if cur is smaller we don't care about it
that means we cant form a new rectangle from there


*/
