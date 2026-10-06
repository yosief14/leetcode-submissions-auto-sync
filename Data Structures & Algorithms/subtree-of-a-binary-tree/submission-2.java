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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        Stack<TreeNode> stack = new Stack <>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val == subRoot.val && isSubtreeIdentical(node, subRoot)){
               return true; 
            }

            if(node.left!= null)stack.push(node.left);
            if(node.right!= null)stack.push(node.right);
        }

        return false;

    }
    private boolean isSubtreeIdentical(TreeNode root, TreeNode subRoot){
        if( root == null && subRoot == null ) return true;
        if(root == null || subRoot == null)return false; 

        return root.val == subRoot.val 
                && isSubtreeIdentical(root.left, subRoot.left) 
                && isSubtreeIdentical(root.right, subRoot.right);



    }
}
