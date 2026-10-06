class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pOne = 0, pTwo = numbers.length - 1;
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
