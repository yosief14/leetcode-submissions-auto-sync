class Solution {
    int length = 0;
    List<List<Integer>> retList = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {

        this.length = nums.length;
        this.nums = nums;

        List<Integer> cur = new ArrayList<>();
        backTrack(0, cur);
        return retList;
        
    }

    private void backTrack(int index, List<Integer> cur){
        if(index == length){
            retList.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[index]);
        backTrack(index+1, cur);
        cur.remove(cur.size()-1);
        backTrack(index+1, cur);

    }
}

