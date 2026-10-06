class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        if(nums.length < 2){
            return false;
        }
    const resultSet = new Set(nums);
    console.log(resultSet.size)
    return resultSet.size != nums.length;    
    }
}
