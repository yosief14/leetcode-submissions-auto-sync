class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap();
        List<List<Integer>> results = new ArrayList(nums.length + 1);

        for (int i = 0; i < nums.length; i++) {
            results.add(new ArrayList<>());
        }

        for (int key : nums) {
            int value = count.getOrDefault(key, 0);
            count.merge(key, 1, Integer::sum);
        }

        count.forEach((key, v) -> { results.get(v-1).add(key); });

        int[] flattenedResults =
            results.stream().flatMap(List::stream).mapToInt(Integer::intValue).toArray();

        int end = flattenedResults.length;
        int star = end - k; 

        return Arrays.stream(flattenedResults).skip(star).toArray();
    }
}
