class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            int num = nums[i];
            int complement = target - num;

            if (complements.containsKey(complement)){
                return new int[] {complements.get(complement), i};
            }
            complements.put(num, i);
        }
        return new int[]{};
    }
}
