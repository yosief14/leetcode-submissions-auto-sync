class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int end = nums.length - 1;
        Arrays.sort(nums);
        int pOne, pTwo, sum;
        List<List<Integer>> results = new ArrayList<>();

        for (int start = 0; start <= end; start++) {
            pOne = start + 1;
            pTwo = end;
            while (pOne < pTwo) {
                if (pOne == start) {
                    pOne++;
                    continue;
                }
                if (pTwo == start) {
                    pTwo--;
                    continue;
                }

                sum = nums[pOne] + nums[pTwo] + nums[start];

                if (sum > 0) {
                    pTwo--;
                } else if (sum < 0) {
                    pOne++;
                } else {
                    List<Integer> b = List.of(nums[pOne], nums[pTwo], nums[start]);
                    if (!results.contains(b)) {
                        results.add(b);
                    }
                    pOne++;
                    pTwo--;
                }
            }
        }
        // System.out.println(Arrays.deepToString(results));
        System.out.println(Arrays.toString(nums));
        return results;
    }
}

// if found How