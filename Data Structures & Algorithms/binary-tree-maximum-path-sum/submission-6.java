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
    int res = 0;
    public int maxPathSum(TreeNode root) {
       res = root.val;
       dfs(root);
       return res;
    }
    private int dfs(TreeNode node){
        if(node == null)  return 0;

        int leftMax = Math.max(dfs(node.left), 0);
        int rightMax = Math.max(dfs(node.right), 0);
        int localSum = node.val + leftMax + rightMax;

        res = Math.max(localSum, res);

        return node.val + Math.max(leftMax, rightMax);
    }
}
