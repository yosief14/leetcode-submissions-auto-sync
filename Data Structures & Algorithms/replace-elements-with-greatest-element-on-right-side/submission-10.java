class Solution {
    public int[] replaceElements(int[] arr) {
        /*
        iterate through list  backwards keeping track of largest number and replacing all numbers
        untill I see a bigger one when there is a larger number go back and replace
        */

        int i = arr.length - 1; 
        int largest = -1;


        while (i >= 0) {
            if (arr[i] > largest) {
                int temp = arr[i];
                arr[i] = largest;
                largest = temp;
            } else {
                arr[i] = largest;
            }
            i--;
        }
        return arr;
    }
}