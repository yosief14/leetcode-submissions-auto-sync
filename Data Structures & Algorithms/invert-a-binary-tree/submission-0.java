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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        } 
        
        TreeNode invertedRoot = new TreeNode(root.val, root.left, root.right);
        
        if(invertedRoot.left == null && invertedRoot.right == null){
            return invertedRoot;
        }
        invertedRoot.left = invertTree(root.right);
        invertedRoot.right =  invertTree(root.left); 
        
        return invertedRoot;
        
    }
}
