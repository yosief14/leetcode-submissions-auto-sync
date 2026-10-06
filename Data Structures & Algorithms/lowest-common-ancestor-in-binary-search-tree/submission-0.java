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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pParents = new ArrayList<>();
        List<TreeNode> qParents = new ArrayList<>();

        findParents(root, p.val, pParents);
        // System.out.println("p: " +p.val +" " +pParents);
        findParents(root, q.val, qParents);
        // System.out.println("q: " +q.val +" " +qParents);

        int maxL = Math.max(qParents.size(),pParents.size());
        for(int i = pParents.size() ; i < maxL ; i++){
            pParents.add(new TreeNode(-1001));
        }

        for(int i = qParents.size() ; i < maxL ; i++){
            qParents.add(new TreeNode(-1001));
        }

        for(int i = 0 ; i < maxL ; i++){
            if(pParents.get(i).val != qParents.get(i).val){
                return pParents.get(i-1);
            }
        }
        return null;

    }

    private void findParents(TreeNode root, int target, List<TreeNode> parents){

        if(root == null){
            return ;
        }
        // System.out.printf("Checking node: %d, target: %d\n", root.val, target );
        // System.out.println("parentsList:"+ parents );

        parents.add(root);
        if(root.val == target){
            return;
        }

        if(root.val < target){
            findParents(root.right, target, parents);
        }else{
            findParents(root.left, target, parents);
        }
    }
}

/*

Problem 1

Iterate through tree 
keeping track of parents in 2 stacks pStack qStack

iterate backwards 

if q.val == root





*/