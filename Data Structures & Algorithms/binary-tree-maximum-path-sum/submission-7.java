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
        // Find left and right max path if its negative than we rule out the path by setting to 0
        int leftMax = Math.max(dfs(node.left), 0);
        int rightMax = Math.max(dfs(node.right), 0);
        // calculate the sum of current path + the parent node val 
        int localSum = node.val + leftMax + rightMax;
        // Check to see if the local sum is max
        res = Math.max(localSum, res);
        //return parent val + the path with largest sum
        return node.val + Math.max(leftMax, rightMax);
    }
}
