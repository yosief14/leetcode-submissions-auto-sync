class Solution {
    public List<List<Integer>> generate(int numRows) {
        /*
        Every row is a int[] in result;

        How do I determine what is above an entry programatically?

        what is above result[i][j]?
            result[i-1][j-1] top left
            result[i-1][j+1] top right

           result[i][j] = [i-1][j+1];

        How do rows grow programatically?
            result[i].length = result[i-1].length + 1;

        In the cases  there is no left or right add 0

        Time complexity of intuitive result
        time = O(n^2) n(n+1)/2
        space= O(n^2) n(n+1)/2
        */

        // initilize result array
        int[][] result = new int[numRows][];
        result[0] = new int[1];
        result[0][0] = 1;
        int row = 1;

        while (row < numRows) {
            result[row] = new int[result[row - 1].length + 1];
            row++;
        }

        int topRight, topLeft;
        int rowLength = 0;
        for (int i = 1; i < numRows; i++) {
            row = i;
            rowLength = result[row].length;
            //set ends to 1
            result[row][0] = 1;
            result[row][rowLength - 1] = 1;
            for (int j = 1; j < rowLength - 1; j++) {
                topLeft = result[row - 1][j - 1];
                topRight = result[row - 1][j];
                result[row][j] = topLeft + topRight;
            }
        }

        return Arrays.stream(result)
            .map(arrayRow
                -> Arrays.stream(arrayRow)
                    .boxed() // Converts int[] to Stream<Integer>
                    .collect(Collectors.toList())) // Converts inner array to List<Integer>
            .collect(Collectors.toList());
    }
}