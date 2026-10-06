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
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       dfs(root); 
       return res;
    }
   
    //decides which direction to climb up
    private int getMaxOfPath(TreeNode root){
        if (root==null) return 0;
        int maxRight = getMaxOfPath(root.right);
        int maxLeft = getMaxOfPath(root.left);
        int pathSum = root.val;
        int maxCanAdd = Math.max(maxRight, maxLeft);
        pathSum += maxCanAdd;
        pathSum = Math.max(0, pathSum);
        return pathSum;
    }

    private void dfs(TreeNode root){
        if(root == null) return;

        int leftSum = getMaxOfPath(root.left);
        int rightSum = getMaxOfPath(root.right);

        res = Math.max(res, rightSum + leftSum + root.val);
        dfs(root.right);
        dfs(root.left);
    }

}

/*
10 - 15 + 20 = 15
15 + 20 + 5 = 40



*/