/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  levels = new ArrayList<>() ;
        dfs(levels, root, 1);
        return levels;

    }
    private void dfs(List<List<Integer>> levels, TreeNode root, int depth){
        if(root == null) return;

        if(levels.size() < depth){
            levels.add(new ArrayList<>(List.of(root.val)));
        }else{
            levels.get(depth-1).add(root.val);
        }

        dfs(levels, root.left, depth+1);
        dfs(levels, root.right, depth+1);

    }
}

/*
counter 

when i go left or right increase depth

how do i carry over the depth?

depth = 2


*/