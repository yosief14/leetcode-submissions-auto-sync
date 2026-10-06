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
    private List<Integer> inView = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root!=null){
        dfs(root,0);
        }
        return inView;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null)
            return;

        if (inView.size() == depth) {
            inView.add(root.val);
        }

        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
}
