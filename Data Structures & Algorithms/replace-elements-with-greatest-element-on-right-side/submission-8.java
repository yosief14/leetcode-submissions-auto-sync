class Solution {
    public int[] replaceElements(int[] arr) {
      /*
      iterate through list  backwards keeping track of largest number and replacing all numbers untill I see a bigger one
      when there is a larger number go back and replace 
      */  
      int i = arr.length - 2;
      int largest = arr[i + 1];
      arr[i + 1] = -1;

      if ( arr.length == 1){
        return arr;
      }

      while(i >= 0){

        if(arr[i] > largest){
            int temp = arr[i];
            arr[i] = largest;
            largest = temp;
        }else {
            arr[i] = largest;
        }
        i--;
      }
      return arr;

        
    }
}