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
    private int count = 0;
    private int largest; 
    public int goodNodes(TreeNode root) {
       largest = root.val;
       dfs(root, largest); 
       return count;
    }
    private void dfs(TreeNode root, int largest){
        if (root == null) return;

        if(largest <= root.val){
            largest = root.val;
            count++;
        }

        dfs(root.left,largest);
        dfs(root.right,largest);
        
    }
}

/*
  2
 1  1

 prev node val is less than current 


  3
 3   null
4 2
*/