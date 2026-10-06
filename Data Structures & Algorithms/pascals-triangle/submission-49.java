class Solution {
    public List<List<Integer>> generate(int numRows) {
        /*
        Every row is a List<Integer> in result;

        How do I determine what is above an entry programatically?
        what is above result.get(i).get(j)?
            result.get(i-1).get(j-1) top left
            result.get(i-1).get(j)   top right

        How do rows grow programatically?
            currentRow.size() = prevRow.size() + 1;

        In the cases there is no left or right add 0

        Time complexity: O(n^2) n(n+1)/2
        Space complexity: O(n^2) n(n+1)/2
        */

        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }

        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            int rowLength = prevRow.size() + 1;
            
            // Create the current row and fill it with zeros (acts like new int[size])
            List<Integer> currentRow = new ArrayList<>();
            for (int k = 0; k < rowLength; k++) {
                currentRow.add(0);
            }

            // Set ends to 1
            currentRow.set(0, 1);
            currentRow.set(rowLength - 1, 1);

            // Calculate inner elements
            for (int j = 1; j < rowLength - 1; j++) {
                int topLeft = prevRow.get(j - 1);
                int topRight = prevRow.get(j);
                currentRow.set(j, topLeft + topRight);
            }

            // Add the completed row to our main result list
            result.add(currentRow);
        }

        return result;
    }
}
