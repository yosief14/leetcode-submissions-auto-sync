class Solution {
    public int[] replaceElements(int[] arr) {
        /*
        iterate through list  backwards keeping track of largest number and replacing all numbers
        untill I see a bigger one when there is a larger number go back and replace
        */

        int i = arr.length - 1; 
        int largest = -1;
        int cur;


        while (i > - 1) {
            cur = arr[i];
            arr[i] = largest;

            if (cur > largest) {
                largest = cur;
            } 
            i--;
        }
        return arr;
    }
}