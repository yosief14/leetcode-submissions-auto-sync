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
        public TreeNode buildTree(int[] preorder, int[] inorder) {

        return dfs(preorder, inorder);
    }

    private TreeNode dfs(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = IntStream.range(0, inorder.length)
                .filter(i -> inorder[i] == root.val)
                .findFirst()
                .orElse(-1);
        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] leftInOrder = Arrays.copyOfRange(inorder, 0, mid);
        root.left = dfs(leftPreOrder, leftInOrder);

        int[] rightPreOrder = Arrays.copyOfRange(preorder, mid + 1, preorder.length);
        int[] rightInOrder = Arrays.copyOfRange(inorder, mid + 1, inorder.length);

        root.right = dfs(rightPreOrder, rightInOrder);
        
        return root;
    }

}
/*
preorder=   [1,2,3,4]
inorder=    [2,1,3,4]

procedure inorder(node)
    if node = null
        return
    inorder(node.left)
    visit(node)
    inorder(node.right)

procedure preorder(node)
    if node = null
        return
    visit(node)
    preorder(node.left)
    preorder(node.right) 
*/