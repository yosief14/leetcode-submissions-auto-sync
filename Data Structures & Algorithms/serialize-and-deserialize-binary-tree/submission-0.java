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

public class Codec {
    private List<String> encoded = new ArrayList<>();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        dsf(root);
        String res = String.join(",", encoded);

        //    System.out.println(res);
        //    System.out.println(encoded);
        return res;
    }

    private void dsf(TreeNode node) {
        if (node == null) {
            encoded.add(null);
            return;
        }
        encoded.add(String.valueOf(node.val));

        dsf(node.left);
        dsf(node.right);
        return;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0)
            return null;
        System.out.println(data);
        int[] i = {0};
        String[] treeNodes = data.split(",");
        return treeBuilder(treeNodes,i);

        // return parent;
    }

    private TreeNode treeBuilder(String[] treeNodes, int[]i) {
        if (treeNodes[i[0]].equals("null")){
            i[0]++;
             return null;
        }
            TreeNode node = new TreeNode (Integer.parseInt(treeNodes[i[0]])); 
            i[0]++;
            node.left=treeBuilder(treeNodes, i);
            node.right=treeBuilder(treeNodes, i);
            return node;
    }
}
