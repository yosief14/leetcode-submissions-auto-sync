class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pOne = 0;
        int pTwo = numbers.length - 1;
        int[] result = new int[] {1,1};
        int sum;

        while (pOne < pTwo) {
            sum =  numbers[pOne] +  numbers[pTwo];;
            if (sum == target) {
                result[0]+=pOne;
                result[1]+=pTwo;
                return result;
            }
            if (sum > target) {
                pTwo--;
            } else {
                pOne++;
            }
        }
        return result;
    }
}

/*
sorted array in asc order
only 1 valid solution

Probably want 2 pointers

Brute Force
Iterate throughn list summing ever possible combination until we hit our target
time: O(n*2)
space: O(1)

Using pointers and eliminating numbers that Are to big;

sum the value the pointers reference
increment or decrement pointers depending on some logic

Logic 1

Pointer on each end
  if p2 is larger
      target decrement p2
  if sum == target return p1 and p2

  if sum of p1 and p2 is to small
      increment p1

  if sum of p1 and p2 is to large
      decrement p2

*/