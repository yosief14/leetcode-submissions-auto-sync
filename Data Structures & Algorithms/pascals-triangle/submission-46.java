class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            int j = 0;
            while (j < i) {
                if (j == 0 || j == i - 1)
                    list.add(1);
                else {
                    list.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
                }
                j++;
            }
            res.add(list);
        }

        return res;
    }
}